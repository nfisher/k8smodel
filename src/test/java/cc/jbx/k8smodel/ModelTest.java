package cc.jbx.k8smodel;

import io.fabric8.kubernetes.api.model.Quantity;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ModelTest {

    @Test
    public void quantityWithoutSuffix() {
        assertThat(new Quantity("2").getAmount(), is("2"));
    }

    @Test
    public void quantityWithSuffix() {
        assertThat(new Quantity("10m").getAmount(), is("10"));
    }
}
