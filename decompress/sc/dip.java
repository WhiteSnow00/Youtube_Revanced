import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.net.Uri;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.io.File;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dip implements dik
{
    private final int a;
    private final Object b;
    
    public dip(final int a) {
        this.a = a;
        this.b = new cya(500L);
    }
    
    public dip(final Context b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dip(final Resources b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dip(final atke b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final dij b(final dio dio) {
        switch (this.a) {
            default: {
                return new acie((atke)this.b, dio.a(File.class, InputStream.class));
            }
            case 8: {
                return new acie((atke)this.b, dio.a(File.class, ByteBuffer.class));
            }
            case 7: {
                return new dhy((Context)this.b, 5, (char[])null);
            }
            case 6: {
                return new dhy((Context)this.b, 4, (byte[])null);
            }
            case 5: {
                return new diy((cya)this.b, null);
            }
            case 4: {
                return new diq((Resources)this.b, din.a, 0);
            }
            case 3: {
                return new diq((Resources)this.b, dio.a(Uri.class, InputStream.class), 0);
            }
            case 2: {
                return new diq((Resources)this.b, dio.a(Uri.class, ParcelFileDescriptor.class), 0);
            }
            case 1: {
                return new dhy((Context)this.b, 2);
            }
            case 0: {
                return new diq((Resources)this.b, dio.a(Uri.class, AssetFileDescriptor.class), 0);
            }
        }
    }
    
    @Override
    public final void c() {
    }
}
