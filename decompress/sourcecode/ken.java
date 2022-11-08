import android.view.ViewStub;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ken implements acil
{
    kgt a;
    kff b;
    acil c;
    private final ViewGroup d;
    private final blt e;
    private final e f;
    
    public ken(final Context context, final blt e, final e f, final byte[] array, final byte[] array2) {
        this.e = e;
        this.f = f;
        this.d = (ViewGroup)LayoutInflater.from(context).inflate(2131624374, (ViewGroup)null);
    }
    
    public final View a() {
        return (View)this.d;
    }
    
    public final void c(final acir acir) {
        final kff b = this.b;
        if (b != null) {
            b.c(acir);
        }
        final kgt a = this.a;
        if (a != null) {
            a.c(acir);
        }
    }
}
