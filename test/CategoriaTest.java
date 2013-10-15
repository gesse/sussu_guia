import configs.AppConfig;
import models.Categoria;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import static org.fest.assertions.Assertions.assertThat;

@ContextConfiguration(classes={AppConfig.class, TestDataConfig.class})
public class CategoriaTest extends AbstractTransactionalJUnit4SpringContextTests {
 
    @Test
    public void setCategoriaDescription() {
        Categoria categoria = new Categoria();
        categoria.descricao = "foo";
        assertThat(categoria.descricao).isEqualTo("foo");
    }

}
