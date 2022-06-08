package pe.unjfsc.quiz.java11.logical;

import java.util.HashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.quiz.java11.entity.CECliente;

public class CLCliente {

    private static final Logger LOG = LoggerFactory.getLogger(CLCliente.class);
    private HashSet<CECliente> oHsData;
    private CECliente oCliente;

    public CLCliente() {
        LOG.info("[FSI] Start CMRetiroSaldoHashSet before crear la instancia: {} ", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet : ", oHsData.isEmpty());
        oHsData.add(new CECliente("333182002","1", "ARANDA CADILLO STEFAN YAMIL", 1249.39));
        oHsData.add(new CECliente("333192002","2", "BENITES MENDOZA JEANPHIER JESUS", 1395.01));
        oHsData.add(new CECliente("333192003","4", "CALIXTO HUANCA EVELYN",1540.63));
        oHsData.add(new CECliente("333192004","4", "CASTILLO TELLO JOAQUIN OTONIEL", 1686.25));
        oHsData.add(new CECliente("333192015","5", "CHAVEZ CALDERON JUDITH ESTHER", 1831.87));
        oHsData.add(new CECliente("333182011","6", "CURIPUMA TINEO INRY JEFFERSON", 1977.49));
        oHsData.add(new CECliente("333192006","7", "DURAND VASQUEZ GUSTAVO DANIEL", 2123.11));
        oHsData.add(new CECliente("333182014","8", "ESTRADA RODRIGUEZ JOSE FERMIN", 2268.73));
        oHsData.add(new CECliente("333152036","9", "FILIOS CAQUI EDUARDO ERIKSON", 2414.35));
        oHsData.add(new CECliente("333191009","10", "GARRO NIETO ELI GEDEON", 2559.97));
        oHsData.add(new CECliente("333192017","11", "GIRALDO LEON YORELDINA VALERIA", 2705.59));
        oHsData.add(new CECliente("333181010","12", "GRADOS GARCIA ANTHONY JEANPIERRE", 2851.21));
        oHsData.add(new CECliente("333191033","13", "JAUREGUI ANGULO SAMYR HYDEKI", 2996.83));
        oHsData.add(new CECliente("333191034","14", "LA CRUZ TRINIDAD JUNIOR LEONARDO", 3142.45));
        oHsData.add(new CECliente("333192018","15", "LA TORRE CHANGANAQUI VIVIAM MILAGROS", 3288.07));
        oHsData.add(new CECliente("333192007","16", "LOLI BAZALAR ERICK FELIX", 3433.69));
        oHsData.add(new CECliente("333192021","17", "LUNA DAMAZO NIMER ANTONY", 3579.31));
        oHsData.add(new CECliente("333192021","18", "MANRIQUE GONZALEZ PEDRO ALBERTO", 3724.93));
        oHsData.add(new CECliente("333192009","19", "MEDRANO TORRES LEONARDO ALONSO", 3870.55));
        oHsData.add(new CECliente("333191014","20", "MELENDEZ DAVILA LUIS ROBERTO", 4016.17));
        oHsData.add(new CECliente("333191014","21", "MELENDEZ PANANA BRANDON DANIEL", 4161.79));
        oHsData.add(new CECliente("333191014","21", "MELENDEZ PANANA BRANDON DANIEL", 4161.79));
      
        LOG.info("[FSI] After - Cpunt del HashSet : {}", oHsData.size());

    }

    //METODOS
    public Object[][] convertHashSetArray(HashSet<CECliente> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][9];
        int iRow = 0;
        for (CECliente oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getOrdenP();
            aDataResponse[iRow][1] = oItem.getOrden();
            aDataResponse[iRow][2] = oItem.getNombre();
            aDataResponse[iRow][3] = String.valueOf(oItem.getImpPedido());
            aDataResponse[iRow][4] = String.valueOf(oItem.getImpuesto());
            aDataResponse[iRow][5] = String.valueOf(oItem.getTotalProy());
            aDataResponse[iRow][6] = String.valueOf(oItem.getRetencion20());
            aDataResponse[iRow][7] = String.valueOf(oItem.getRetencion30());
            aDataResponse[iRow][8] = String.valueOf(oItem.getRetencion40());

            iRow++;
        }
        return aDataResponse;
    }

    /* Si el saldo (impuesto - 20% retencion)/2 es > 200 agregar en una nueva 
        lista para mostrar la información.*/
    public Object codicion(HashSet<CECliente> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][9];
        int iRow = 0;

        for (CECliente oItem : poHsData) {
            double cd = (oItem.getImpuesto() - oItem.getRetencion20()) / 2;
            if (cd > 200) {
                aDataResponse[iRow][0] = oItem.getOrdenP();
                aDataResponse[iRow][1] = oItem.getOrden();
                aDataResponse[iRow][2] = oItem.getNombre();
                aDataResponse[iRow][3] = String.valueOf(oItem.getImpPedido());
                aDataResponse[iRow][4] = String.valueOf(oItem.getImpuesto());
                aDataResponse[iRow][5] = String.valueOf(oItem.getTotalProy());
                aDataResponse[iRow][6] = String.valueOf(oItem.getRetencion20());
                aDataResponse[iRow][7] = String.valueOf(oItem.getRetencion30());
                aDataResponse[iRow][8] = String.valueOf(oItem.getRetencion40());
            }

            iRow++;
        }
        return aDataResponse;

    }

    public Object Impuesto(double ImpPedido) {
        double imp18
                = Math.round((ImpPedido * 0.18) * 100.0) / 100.0;
        return imp18;
    }

    public Object TotalProy(double imp18, double ImpPedido) {
        double total = imp18
                + ImpPedido;
        return total;
    }

    public Object Retenc20(double imp18) {
        double rt20 = Math.round((imp18 * 0.2) * 100.0) / 100.0;
        return rt20;
    }

    public Object Retenc30(double imp18) {
        double rt30 = Math.round((imp18 * 0.3) * 100.0) / 100.0;
        return rt30;

    }

    public Object Retenc40(double imp18) {
        double rt40 = Math.round((imp18 * 0.4) * 100.0) / 100.0;
        return rt40;

    }
}
