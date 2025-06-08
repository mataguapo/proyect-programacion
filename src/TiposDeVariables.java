import java.util.HashMap;

public class TiposDeVariables {
    public static void main (String[]args){
        HashMap<Integer,String>variables_metricas = new HashMap<>();
        variables_metricas.put(1,"salario");
        variables_metricas.put(2,"edad");
        variables_metricas.put(3,"peso");
        variables_metricas.put(4,"discretas");
        variables_metricas.put(5,"continuas");
        variables_metricas.put(6,"porcentaje");
        variables_metricas.put(7,"económicas cuantitativas");
        variables_metricas.put(8,"intervalo");
        variables_metricas.put(9,"Tasas de cambio");


        HashMap<Integer, String> variables_ordinales = new HashMap<>();
        variables_ordinales.put(1, "grado academico ");
        variables_ordinales.put(2, "medio");
        variables_ordinales.put(3, "Rangos");
        variables_ordinales.put(4, "fases");
        variables_ordinales.put(5, "Clasificaciones por orden");
        variables_ordinales.put(6, "Nivel de satisfacción");
        variables_ordinales.put(7, "Calificaciones literales");
        variables_ordinales.put(8, "Nivel de discapacidad");
        variables_ordinales.put(9, "Prioridad");
        variables_ordinales.put(10, "Riesgo");

        HashMap<Integer, String> variables_nominales = new HashMap<>();
        variables_nominales.put(1, "estado civil");
        variables_nominales.put(2, "Tipo de sangre");
        variables_nominales.put(3, "País de origen");
        variables_nominales.put(4, "Profesión");
        variables_nominales.put(5, "Sector económico");
        variables_nominales.put(6, "Sistema operativo");
        variables_nominales.put(7, "Navegador web");
        variables_nominales.put(8, "Marca de producto");
        variables_nominales.put(9, "Método de pago");
        variables_nominales.put(10, "sexo");
        variables_nominales.put(11, "Idioma ");

        HashMap<Integer, String> variables_dependientes = new HashMap<>();
        variables_dependientes.put(1,"venta totales");
        variables_dependientes.put(2,"Tasa de conversión");
        variables_dependientes.put(3,"Porcentaje de crecimiento");
        variables_dependientes.put(4,"Estado de aprobación");
        variables_dependientes.put(5,"Clasificación de clientes");
        variables_dependientes.put(6,"Precio ");
        variables_dependientes.put(7,"Número de visitas mensuales");
        variables_dependientes.put(8,"sexo");
        variables_dependientes.put(9,"salario");
        variables_dependientes.put(10,"edad");
        variables_dependientes.put(11,"lugar");
        variables_dependientes.put(12,"grado academico");

        HashMap<Integer, String> variables_independientes = new HashMap<>();
        variables_independientes.put(1,"Precio de producto");
        variables_independientes.put(2,"Presupuesto de marketing");
        variables_independientes.put(3,"Horas de entrenamiento");
        variables_independientes.put(4,"Tipo de campaña publicitaria");
        variables_independientes.put(5,"Ubicación geográfica ");
        variables_independientes.put(6,"Días de la semana ");
        variables_independientes.put(7,"Estación del año");
        variables_independientes.put(8,"Descuento aplicado");
        variables_independientes.put(9,"Número de empleados asignados");
        variables_independientes.put(10,"Inventario inicial");
        variables_independientes.put(11,"Tasa de interés");
        variables_independientes.put(12,"Tiempo de entrega");
        variables_independientes.put(13,"Turno de trabajo");
        variables_independientes.put(14,"Canal de venta");
        variables_independientes.put(15,"Tipo de cliente");
        variables_independientes.put(16,"Método de envío");
        variables_independientes.put(17,"Publicidad pagada ");
        variables_independientes.put(18,"Promoción activa");
        variables_independientes.put(19,"Producto en garantía");

        HashMap<Integer, String> variable_mediadiora = new HashMap<>();
        variable_mediadiora.put(1,"Satisfacción del cliente");
        variable_mediadiora.put(2,"Tasa de conversión ");
        variable_mediadiora.put(3,"Eficiencia operativa");
        variable_mediadiora.put(4,"Margen de utilidad");
        variable_mediadiora.put(5,"Rotación de inventario");
        variable_mediadiora.put(6,"Engagement digital");
        variable_mediadiora.put(7,"Retención de empleados ");
        variable_mediadiora.put(8,"Tiempo de respuesta ");
        variable_mediadiora.put(9,"Tasa de retención");
        variable_mediadiora.put(10,"Rentabilidad por campaña");

        HashMap<Integer, String> variable_moderadora = new HashMap<>();
        variable_moderadora.put(1,"Edad del cliente");
        variable_moderadora.put(2,"Género");
        variable_moderadora.put(3,"Nivel de ingresos");
        variable_moderadora.put(4,"Tipo de suscripción");
        variable_moderadora.put(5,"Región geográfica");
        variable_moderadora.put(6,"Temporada");
        variable_moderadora.put(7,"Tamaño de la empresa");
        variable_moderadora.put(8,"Antigüedad del empleado");
        variable_moderadora.put(9,"Dispositivo utilizado");
        variable_moderadora.put(10,"Nivel de membresía");
        variable_moderadora.put(11,"Frecuencia de compra");
        variable_moderadora.put(12,"Método de pago preferido");
        variable_moderadora.put(13,"Día de la semana ");
        variable_moderadora.put(14,"Hora del día");
        variable_moderadora.put(15,"Fuente de tráfico");







    }
}
