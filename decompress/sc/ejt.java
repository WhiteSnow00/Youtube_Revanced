import java.util.List;
import java.util.Iterator;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.math.BigDecimal;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejt implements eka
{
    public final Double a;
    
    public ejt(final Double a) {
        if (a == null) {
            this.a = Double.NaN;
            return;
        }
        this.a = a;
    }
    
    public final eka d() {
        return (eka)new ejt(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ejt && this.a.equals(((ejt)o).a));
    }
    
    public final Boolean g() {
        final boolean naN = Double.isNaN(this.a);
        boolean b = false;
        if (!naN) {
            b = b;
            if (this.a != 0.0) {
                b = true;
            }
        }
        return b;
    }
    
    public final Double h() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String i() {
        if (Double.isNaN(this.a)) {
            return "NaN";
        }
        if (!Double.isInfinite(this.a)) {
            final BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.a).stripTrailingZeros();
            final DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            int n;
            if (stripTrailingZeros.scale() > 0) {
                n = stripTrailingZeros.precision();
            }
            else {
                n = stripTrailingZeros.scale();
            }
            decimalFormat.setMinimumFractionDigits(n - 1);
            final String format = decimalFormat.format(stripTrailingZeros);
            final int index = format.indexOf("E");
            String s = format;
            if (index > 0) {
                final int int1 = Integer.parseInt(format.substring(index + 1));
                if ((int1 < 0 && int1 > -7) || (int1 >= 0 && int1 < 21)) {
                    s = stripTrailingZeros.toPlainString();
                }
                else {
                    s = format.replace("E-", "e-").replace("E", "e+");
                }
            }
            return s;
        }
        if (this.a > 0.0) {
            return "Infinity";
        }
        return "-Infinity";
    }
    
    public final Iterator l() {
        return null;
    }
    
    public final eka lA(final String s, final hyx hyx, final List list) {
        if ("toString".equals(s)) {
            return (eka)new ekd(this.i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", this.i(), s));
    }
    
    @Override
    public final String toString() {
        return this.i();
    }
}
