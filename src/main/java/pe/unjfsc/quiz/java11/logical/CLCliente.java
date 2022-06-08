package pe.unjfsc.quiz.java11.logical;

import java.util.HashSet;
import pe.unjfsc.quiz.java11.entity.CECliente;

public class CLCliente {

    //METODOS
    public Object[][] convertHashSetArray(HashSet<CECliente> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][9];
        int iRow = 0;
        for (CECliente oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getOrdenP();
            aDataResponse[iRow][1] = oItem.getOrden();
            aDataResponse[iRow][2] = oItem.getNombre();
            aDataResponse[iRow][3] = String.valueOf(oItem.getImpPedido());
            aDataResponse[iRow][4] = String.valueOf(Impuesto(oItem.getImpPedido()));
            aDataResponse[iRow][5] = String.valueOf(TotalProy(oItem.getImpPedido(), (double) Impuesto(oItem.getImpPedido())));

            aDataResponse[iRow][6] = String.valueOf(Retenc20((double) Impuesto(oItem.getImpPedido())));
            aDataResponse[iRow][7] = String.valueOf(Retenc30((double) Impuesto(oItem.getImpPedido())));
            aDataResponse[iRow][8] = String.valueOf(Retenc40((double) Impuesto(oItem.getImpPedido())));

            iRow++;
        }
        return aDataResponse;
    }

    /* Si el saldo (impuesto - 20% retencion)/2 es > 200 agregar en una nueva 
        lista para mostrar la información.*/
    public Object[][] codicion(HashSet<CECliente> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][9];
        int iRow = 0;

        for (CECliente oItem : poHsData) {
            double impuesto = (double) Impuesto(oItem.getImpPedido());
            double retec20 = (double) Retenc20(impuesto);

            //double cd = ((double) oItem.getImpPedido() - (double) Retenc20((double) Impuesto(oItem.getImpPedido()))) / 2;
            if (retec20 > 200) {
                aDataResponse[iRow][0] = oItem.getOrdenP();
                aDataResponse[iRow][1] = oItem.getOrden();
                aDataResponse[iRow][2] = oItem.getNombre();
                aDataResponse[iRow][3] = String.valueOf(oItem.getImpPedido());
                aDataResponse[iRow][4] = String.valueOf(Impuesto(oItem.getImpPedido()));
                aDataResponse[iRow][5] = String.valueOf(TotalProy(oItem.getImpPedido(), (double) Impuesto(oItem.getImpPedido())));

                aDataResponse[iRow][6] = String.valueOf(Retenc20((double) Impuesto(oItem.getImpPedido())));
                aDataResponse[iRow][7] = String.valueOf(Retenc30((double) Impuesto(oItem.getImpPedido())));
                aDataResponse[iRow][8] = String.valueOf(Retenc40((double) Impuesto(oItem.getImpPedido())));

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
