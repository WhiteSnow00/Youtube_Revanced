import android.content.DialogInterface;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.content.DialogInterface$OnCancelListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgj implements DialogInterface$OnCancelListener
{
    public final otu a;
    public final CommandOuterClass$Command b;
    public final ots c;
    
    public acgj(final otu a, final CommandOuterClass$Command b, final ots c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.a.a(this.b, this.c).U();
    }
}
