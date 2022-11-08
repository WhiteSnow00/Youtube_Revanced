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

public final class dio implements dij
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public dio(final int a) {
        this.a = a;
        this.b = new cxz(500L);
    }
    
    public dio(final Context b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dio(final Resources b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dio(final atjj b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final dii b(final din din) {
        switch (this.a) {
            default: {
                return (dii)new acgb((atjj)this.b, din.a((Class)File.class, (Class)InputStream.class));
            }
            case 8: {
                return (dii)new acgb((atjj)this.b, din.a((Class)File.class, (Class)ByteBuffer.class));
            }
            case 7: {
                return (dii)new dhx((Context)this.b, 5, (char[])null);
            }
            case 6: {
                return (dii)new dhx((Context)this.b, 4, (byte[])null);
            }
            case 5: {
                return (dii)new dix((cxz)this.b, null);
            }
            case 4: {
                return (dii)new dip((Resources)this.b, (dii)dim.a, 0);
            }
            case 3: {
                return (dii)new dip((Resources)this.b, din.a((Class)Uri.class, (Class)InputStream.class), 0);
            }
            case 2: {
                return (dii)new dip((Resources)this.b, din.a((Class)Uri.class, (Class)ParcelFileDescriptor.class), 0);
            }
            case 1: {
                return (dii)new dhx((Context)this.b, 2);
            }
            case 0: {
                return (dii)new dip((Resources)this.b, din.a((Class)Uri.class, (Class)AssetFileDescriptor.class), 0);
            }
        }
    }
    
    public final void c() {
    }
}
