import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import java.io.File;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebs implements arjd
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public aebs(final aeby b, final int a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public aebs(final atjj b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public static aebs b(final atjj atjj) {
        return new aebs(atjj, 5);
    }
}
