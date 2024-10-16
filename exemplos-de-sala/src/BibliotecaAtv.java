// Classe Livro
class Livro {
    String titulo = "O Senhor dos Anéis";
    String autor = "J.R.R. Tolkien";
    boolean disponivel = true;

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro "+this.titulo+" foi emprestado.");
        } else {
            System.out.println("O livro "+this.titulo+" já está emprestado.");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro "+this.titulo+" foi devolvido.");
        } else {
            System.out.println("O livro "+this.titulo+" já está disponível.");
        }
    }

    public void exibirInfo() {
        System.out.println("Título: "+this.titulo+", Autor: "+this.autor+", Disponível: "+this.disponivel);
    }
}

class Usuario {
    String nome = "João";
    int idade = 25;
    int livrosEmprestados = 0;

    public void pegarLivroEmprestado(Livro livro) {
        if (livro.disponivel) {
            this.livrosEmprestados++;
            livro.emprestar();
            System.out.println(this.nome+" pegou "+livro.titulo+" emprestado.");
        } else {
            System.out.println(this.nome+" já está emprestado.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (this.livrosEmprestados > 0 && !livro.disponivel) {
            this.livrosEmprestados--;
            livro.devolver();
            System.out.println(this.nome+" devolveu "+livro.titulo+".");
        } else {
            System.out.println(this.nome+" não tem livros para devolver.");
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: "+this.nome+", Idade: "+this.idade+", Livros Emprestados: "+this.livrosEmprestados);
    }
}

class Biblioteca {
    String nome = "Biblioteca Central";
    String endereco = "Rua dos Livros, 123";
    int totalLivros = 100;

    public void adicionarLivro() {
        this.totalLivros++;
        System.out.println("Novo livro adicionado. Total de livros: "+this.totalLivros);
    }

    public void removerLivro() {
        if (this.totalLivros > 0) {
            this.totalLivros--;
            System.out.println("Livro removido. Total de livros: "+this.totalLivros);
        } else {
            System.out.println("Nenhum livro para remover.");
        }
    }

    public void exibirInfo() {
        System.out.println("Biblioteca: "+this.nome+", Endereço: "+this.endereco+", Total de Livros: "+this.totalLivros);
    }
}

public class BibliotecaAtv {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Usuario usuario = new Usuario();
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.exibirInfo();
        livro.exibirInfo();
        usuario.exibirInfo();

        usuario.pegarLivroEmprestado(livro);
        livro.exibirInfo();
        usuario.exibirInfo();

        usuario.devolverLivro(livro);
        livro.exibirInfo();
        usuario.exibirInfo();
    }
}
