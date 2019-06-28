package test.dao;

import br.com.senai.model.dto.Usuario;

public class UsuarioDaoTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("Pedro Henrique França Marques Miranda");
        usuario.setCpf("04325469109");
        //usuario.setDataNascimento(2019-06-25);
        usuario.setSexo(1);
    }
}