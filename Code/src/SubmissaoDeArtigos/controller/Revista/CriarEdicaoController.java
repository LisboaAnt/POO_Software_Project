package SubmissaoDeArtigos.controller.Revista;

import SubmissaoDeArtigos.model.EdicaoModel;
import SubmissaoDeArtigos.model.Model;
import SubmissaoDeArtigos.view.Observer;
import SubmissaoDeArtigos.view.Revista.CriarEdicaoView;


/**
 *
 * @author mcair
 */
public class CriarEdicaoController {
    
    private CriarEdicaoView view;
    private EdicaoModel model;

    public CriarEdicaoController(CriarEdicaoView view, EdicaoModel model) {
        this.view = view;
        this.model = model;

        // Adicionar um ActionListener ao botão "Cancelar"
        this.view.addCancelarListener(new CancelarListener());

        // Adicionar um ActionListener ao botão "Criar Edição"
        this.view.addCriarEdicaoListener(new CriarEdicaoListener());
    }

    // ActionListener para o botão "Cancelar"
    class CancelarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Voltar para a página inicial ou fazer outra ação desejada
            // Exemplo: view.mostrarPaginaInicial();
        }
    }

    // ActionListener para o botão "Criar Edição"
    class CriarEdicaoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String numeroEdicao = view.getNumeroEdicao(); // Obter o número da edição digitado na tela
            String nomeEdicao = view.getNomeEdicao(); // Obter o nome da edição digitado na tela

            // Validar os campos da edição, se necessário

            // Criar uma nova instância de EdicaoModel com os dados fornecidos
            EdicaoModel novaEdicao = new EdicaoModel(numeroEdicao, nomeEdicao);

            // Armazenar a nova edição em algum lugar (por exemplo, em uma lista ou banco de dados)
            model.adicionarEdicao(novaEdicao);

            // Realizar ação adicional após a criação da edição, se necessário

            // Limpar os campos da tela de criação de edição
            view.limparCampos();

            // Exibir uma mensagem de sucesso ou realizar outra ação desejada
            // Exemplo: view.mostrarMensagem("Edição criada com sucesso!");
        }
    }
}
