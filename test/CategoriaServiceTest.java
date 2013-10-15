import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import models.Categoria;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import services.CategoriaBO;
import configs.AppConfig;

@ContextConfiguration(classes={AppConfig.class, TestDataConfig.class})
public class CategoriaServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CategoriaBO categoriaService;

    @Test
    public void createCategoria() {
        Categoria categoria = new Categoria();
        categoria.descricao = "foo";
        categoriaService.add(categoria);
        assertThat(categoria.id).isNotNull();
    }

    @Test
    public void getCategorias() {
        createCategoria();
        List<Categoria> categorias = categoriaService.getAll();
        assertThat(categorias.size()).isEqualTo(1);
    }

}