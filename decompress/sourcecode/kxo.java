import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxo
{
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    
    public kxo(final Context context, final uyf uyf, final uyi uyi) {
        final Resources resources = context.getResources();
        int n = resources.getDimensionPixelSize(2131166492);
        final TypedValue typedValue = new TypedValue();
        resources.getValue(2131166490, typedValue, true);
        final float float1 = typedValue.getFloat();
        resources.getValue(2131166491, typedValue, true);
        float float2 = typedValue.getFloat();
        resources.getValue(2131166489, typedValue, true);
        alvl alvl;
        if ((uyf.b().b & 0x10) != 0x0) {
            if ((alvl = uyf.b().e) == null) {
                alvl = alvl.a;
            }
        }
        else {
            alvl = null;
        }
        if (alvl == null) {
            this.a = float2;
            this.b = float1;
            this.c = n;
            this.d = 0.0f;
            this.e = 0.0f;
            return;
        }
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        final float n2 = alvl.n;
        if (n2 > 0.0f) {
            float2 = n2;
        }
        this.a = float2;
        this.b = 1.0f;
        final float o = alvl.o;
        if (o > 0.0f) {
            n = tmy.aZ(displayMetrics, (int)o);
        }
        this.c = n;
        this.d = tmy.aN((float)uyi.g(45353195L), 0.0f, 1.0f);
        this.e = tmy.aN((float)uyi.g(45353196L), 0.0f, 1.0f);
    }
}
