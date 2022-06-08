package pe.unjfsc.quiz.java11.modelo.imp;

import java.util.HashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.quiz.java11.entity.CECliente;
import pe.unjfsc.quiz.java11.logical.CLCliente;
import pe.unjfsc.quiz.java11.model.CICCambioCliente;

public class CMCambiarCliemte implements CICCambioCliente {

    private static final Logger LOG = LoggerFactory.getLogger(CLCliente.class);
    private HashSet<CECliente> oHsData;

    public CMCambiarCliemte() {
        LOG.info("[FSI] Start CMRetiroSaldoHashSet before crear la instancia: {} ", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet : ", oHsData.isEmpty());
        oHsData.add(new CECliente("333182002", "1", "ARANDA CADILLO STEFAN YAMIL", 1249.39));
        oHsData.add(new CECliente("333192002", "2", "BENITES MENDOZA JEANPHIER JESUS", 1395.01));
        oHsData.add(new CECliente("333192003", "4", "CALIXTO HUANCA EVELYN", 1540.63));
        oHsData.add(new CECliente("333192004", "4", "CASTILLO TELLO JOAQUIN OTONIEL", 1686.25));
        oHsData.add(new CECliente("333192015", "5", "CHAVEZ CALDERON JUDITH ESTHER", 1831.87));
        oHsData.add(new CECliente("333182011", "6", "CURIPUMA TINEO INRY JEFFERSON", 1977.49));
        oHsData.add(new CECliente("333192006", "7", "DURAND VASQUEZ GUSTAVO DANIEL", 2123.11));
        oHsData.add(new CECliente("333182014", "8", "ESTRADA RODRIGUEZ JOSE FERMIN", 2268.73));
        oHsData.add(new CECliente("333152036", "9", "FILIOS CAQUI EDUARDO ERIKSON", 2414.35));
        oHsData.add(new CECliente("333191009", "10", "GARRO NIETO ELI GEDEON", 2559.97));
        oHsData.add(new CECliente("333192017", "11", "GIRALDO LEON YORELDINA VALERIA", 2705.59));
        oHsData.add(new CECliente("333181010", "12", "GRADOS GARCIA ANTHONY JEANPIERRE", 2851.21));
        oHsData.add(new CECliente("333191033", "13", "JAUREGUI ANGULO SAMYR HYDEKI", 2996.83));
        oHsData.add(new CECliente("333191034", "14", "LA CRUZ TRINIDAD JUNIOR LEONARDO", 3142.45));
        oHsData.add(new CECliente("333192018", "15", "LA TORRE CHANGANAQUI VIVIAM MILAGROS", 3288.07));
        oHsData.add(new CECliente("333192007", "16", "LOLI BAZALAR ERICK FELIX", 3433.69));
        oHsData.add(new CECliente("333192021", "17", "LUNA DAMAZO NIMER ANTONY", 3579.31));
        oHsData.add(new CECliente("333192021", "18", "MANRIQUE GONZALEZ PEDRO ALBERTO", 3724.93));
        oHsData.add(new CECliente("333192009", "19", "MEDRANO TORRES LEONARDO ALONSO", 3870.55));
        oHsData.add(new CECliente("333191014", "20", "MELENDEZ DAVILA LUIS ROBERTO", 4016.17));
        oHsData.add(new CECliente("333191014", "21", "MELENDEZ PANANA BRANDON DANIEL", 4161.79));
        oHsData.add(new CECliente("333181020", "22", "MORALES OYOLA JOSE JEAN PIERRE", 4307.41));
        oHsData.add(new CECliente("333191015", "23", "MORENO FERMIN MICHAEL FELIPE", 4453.03));
        oHsData.add(new CECliente("333132027", "24", "MOYA PACHECO FREDDY WILLY", 4598.65));
        oHsData.add(new CECliente("333161031", "25", "NATIVIDAD RODRIGUEZ JOSE ANTHONY", 4744.27));
        oHsData.add(new CECliente("333192024", "26", "NAVARRO ANASTACIO MIRELLA ANAI", 4889.89));
        oHsData.add(new CECliente("333192025", "27", "ORTIZ DIAZ ZINEDINE ZIDANE", 5035.51));
        oHsData.add(new CECliente("333182021", "28", "OSTOS ANDRES CARLOS ALBEYRO", 5181.13));
        oHsData.add(new CECliente("333152020", "29", "PANANA ARISMENDIZ ALDAIR MIGUEL", 5326.75));
        oHsData.add(new CECliente("333191035", "30", "PAZ SOLDAN BERNAL CARLOS GUILLERMO", 5472.37));
        oHsData.add(new CECliente("333182022", "31", "PEREZ OSORIO ANGEL ROBERTO", 5617.99));
        oHsData.add(new CECliente("333172023", "32", "PIZARRO BARRIOS GIANPIERRE GUILLERMO", 5763.61));
        oHsData.add(new CECliente("333192027", "33", "QUESQUEN CARVALLO TATIANA DEL PILAR", 5909.23));
        oHsData.add(new CECliente("333192028", "34", "RIOS NICHO KEVIN JHOEL", 6054.85));
        oHsData.add(new CECliente("333191023", "35", "SANTOS ISIDRO CRISTIAN ALVARO", 6200.47));
        oHsData.add(new CECliente("333141039", "36", "SÍLVA CUEVA ALEXANDER HERNÁN", 6346.09));
        oHsData.add(new CECliente("333192030", "37", "TADEO JARA CHRISTOPER RAUL", 6491.71));
        oHsData.add(new CECliente("333191038", "38", "SUÑURUCO HUAMAN DANIEL ALEJANDRO", 6637.33));
        oHsData.add(new CECliente("333152032", "39", "VÁSQUEZ JARAMILLO SERGIO DAVID", 6782.95));
        oHsData.add(new CECliente("333152032", "40", "VEREAU FLORES GIOVANNI NILO", 6928.57));

        LOG.info("[FSI] After - Cpunt del HashSet : {}", oHsData.size());

    }

    @Override
    public HashSet<CECliente> consultAllClienteCIC() {
        LOG.info("[FSI] Start consultAllClienteCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }

}
