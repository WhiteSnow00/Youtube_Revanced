import java.util.List;
import java.util.Iterator;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import android.net.Uri;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqv implements Callable
{
    private final bbk a;
    private final abqr b;
    private final Uri c;
    
    public abqv(final bbk a, final Uri c, final abqr b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
}
