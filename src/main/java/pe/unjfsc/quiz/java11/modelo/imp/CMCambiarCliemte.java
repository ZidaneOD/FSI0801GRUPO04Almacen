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
        oHsData.add(new CECliente("333191014", "21", "MELENDEZ PANANA BRANDON DANIEL", 4161.79));

        LOG.info("[FSI] After - Cpunt del HashSet : {}", oHsData.size());
    }

    @Override
    public HashSet<CECliente> consultAllClienteCIC() {
        LOG.info("[FSI] Start consultAllClienteCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }

}
