package org.example;

import com.mathsystem.api.graph.GraphFactory;
import com.mathsystem.api.graph.model.Graph;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfConnectedComponents implements GraphCharacteristic {
    /*
      0 1
      1 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph1.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 1 1
      1 0 1
      1 1 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph2.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph3.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 1 0 0
      1 0 1 0
      0 1 0 1
      0 0 1 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph4.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 1 0 1 1 0
      0 0 1 1 0 0
      1 0 0 0 1 0
      0 0 1 0 0 0
      0 0 0 1 0 0
      1 0 0 1 1 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph5.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 0 0
      1 0 1
      1 0 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph6.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 1 0 1 0 1
      1 0 1 1 0 0
      0 1 0 1 1 0
      1 1 1 0 1 1
      0 0 1 1 0 1
      1 0 0 1 1 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph7.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 1 0 0 0
      0 0 1 1 0
      0 0 0 0 1
      0 1 1 0 0
      1 1 0 1 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph8.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 1 0 0
      0 0 1 1
      0 0 0 0
      1 0 1 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph9.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 1 0
      1 0 1
      0 1 0
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph10.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
    */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph11.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }

    /*
      0 1 0 0 0 1 0
      0 0 1 0 0 0 0
      0 0 0 1 0 0 0
      0 0 1 0 0 0 1
      0 0 0 1 0 0 0
      1 0 0 0 1 0 0
      0 0 1 0 0 1 0
     */
    @Test
    void shouldNumberOfConnectedComponents1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testgraph12.txt"));

        ConnecetedComponents сonnecetedComponents = new ConnecetedComponents();
        assertThat(сonnecetedComponents.execute(testGraph)).isEqualTo(true);
    }
}
