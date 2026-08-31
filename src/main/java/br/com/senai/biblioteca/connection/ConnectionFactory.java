package br.com.senai.biblioteca.connection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class ConnectionFactory {
    private static final Properties CONFIG = carregarConfiguracao();

    private ConnectionFactory() {}

    private static Properties carregarConfiguracao() {
        Properties props = new Properties();

        try (InputStream input = ConnectionFactory.class.getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                throw new IllegalStateException(
                        "Crie config.properties a partir de config.properties.example."
                );
            }

            props.load(input);
            return props;

        } catch (IOException e) {
            throw new IllegalStateException("Erro ao carregar configuração.", e);
        }
    }

    public static Connection abrirConexao() throws SQLException {
        return DriverManager.getConnection(
                CONFIG.getProperty("db.url"),
                CONFIG.getProperty("db.user"),
                CONFIG.getProperty("db.password")
        );
    }
}
