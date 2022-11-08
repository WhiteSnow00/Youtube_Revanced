import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxm
{
    public static final DecimalFormatSymbols a;
    public static final DecimalFormat b;
    public static final DecimalFormat c;
    
    static {
        final DecimalFormatSymbols decimalFormatSymbols = a = new DecimalFormatSymbols(Locale.US);
        b = new DecimalFormat("0.00", decimalFormatSymbols);
        c = new DecimalFormat("0.000", decimalFormatSymbols);
    }
}
