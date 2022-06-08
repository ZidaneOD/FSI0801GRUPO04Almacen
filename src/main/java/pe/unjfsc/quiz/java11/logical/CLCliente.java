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
        //oHsData.add(new CECliente(1, "2002", 2002.99));
        //oHsData.add(new CECliente(2, "2003", 2003.99));
        //oHsData.add(new CECliente(3, "2004", 2004.99));
        //oHsData.add(new CECliente(4, "2005", 2005.99));
        //oHsData.add(new CECliente(5, "2006", 2006.99));
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
