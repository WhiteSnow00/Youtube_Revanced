import com.google.protobuf.MessageLite;
import android.view.ViewStub;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jga extends jfl
{
    private final acnj b;
    private final View c;
    private final ike d;
    private inp e;
    private final blt f;
    
    public jga(final Context context, final vax vax, final giz giz, final acnj b, final qbo qbo, final alm alm, final blt f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context, vax, giz, alm, 2131624943, new nx(context.getResources().getDimensionPixelSize(2131168345), context.getResources().getDimensionPixelSize(2131168344)), new nx(context.getResources().getDimensionPixelSize(2131168345), context.getResources().getDimensionPixelSize(2131168343)), context.getResources().getDimensionPixelSize(2131165561), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.c = this.a().findViewById(2131428448);
        this.d = qbo.Q((ViewStub)this.a().findViewById(2131430123), (ikn)null);
        this.f = f;
    }
    
    public final void c(final acir acir) {
        final inp e = this.e;
        if (e != null) {
            e.b.m((Object)e);
            tmy.v((View)e.c, false);
            tmy.v(e.d, true);
            e.e = null;
            this.e = null;
        }
    }
}
