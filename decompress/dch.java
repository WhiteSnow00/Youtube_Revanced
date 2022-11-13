import android.content.ContentResolver;
import android.content.res.Resources;
import android.content.Context;
import java.net.URL;
import java.io.File;
import android.net.Uri;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import android.graphics.drawable.Drawable;
import java.io.InputStream;
import android.os.Build$VERSION;
import com.bumptech.glide.module.AppGlideModule;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dch implements dpb
{
    final dbp a;
    final List b;
    final AppGlideModule c;
    private boolean d;
    
    public dch(final dbp a, final List b, final AppGlideModule c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ Object a() {
        if (!this.d) {
            this.d = true;
            try {
                final dbp a = this.a;
                final List b = this.b;
                final AppGlideModule c = this.c;
                final dgg a2 = a.a;
                final dge c2 = a.c;
                final Context applicationContext = a.b.getApplicationContext();
                final cya g = a.b.g;
                final dcg dcg = new dcg();
                dcg.k((dde)new djt());
                if (Build$VERSION.SDK_INT >= 27) {
                    dcg.k((dde)new dkf());
                }
                final Resources resources = applicationContext.getResources();
                final List b2 = dcg.b();
                final dlh dlh = new dlh(applicationContext, b2, a2, c2);
                final dkx dkx = new dkx(a2, (dkv)new dku(2));
                final dkb dkb = new dkb(dcg.b(), resources.getDisplayMetrics(), a2, c2);
                Object o;
                djm djm;
                if (Build$VERSION.SDK_INT >= 28 && g.f(dbs.class)) {
                    o = new djm(2, (byte[])null);
                    djm = new djm(0);
                }
                else {
                    djm = new djm(dkb, 1);
                    o = new dkp(dkb, c2, 0);
                }
                if (Build$VERSION.SDK_INT >= 28) {
                    dcg.h("Animation", (Class)InputStream.class, (Class)Drawable.class, (ddr)new djm(new dml(b2, c2), 5, (byte[])null));
                    dcg.h("Animation", (Class)ByteBuffer.class, (Class)Drawable.class, (ddr)new djm(new dml(b2, c2), 4, (byte[])null));
                }
                final dlf dlf = new dlf(applicationContext);
                final dip dip = new dip(resources, 3);
                final dip dip2 = new dip(resources, 4);
                final dip dip3 = new dip(resources, 2);
                final dip dip4 = new dip(resources, 0);
                final dji dji = new dji(c2);
                final dls dls = new dls(1);
                final dlv dlv = new dlv(1);
                final ContentResolver contentResolver = applicationContext.getContentResolver();
                dcg.d((Class)ByteBuffer.class, (ddc)new dhr());
                dcg.d((Class)InputStream.class, (ddc)new dir(c2));
                dcg.h("Bitmap", (Class)ByteBuffer.class, (Class)Bitmap.class, (ddr)djm);
                dcg.h("Bitmap", (Class)InputStream.class, (Class)Bitmap.class, (ddr)o);
                if (dem.d()) {
                    dcg.h("Bitmap", (Class)ParcelFileDescriptor.class, (Class)Bitmap.class, (ddr)new djm(dkb, 3));
                }
                dcg.h("Bitmap", (Class)ParcelFileDescriptor.class, (Class)Bitmap.class, (ddr)dkx);
                dcg.h("Bitmap", (Class)AssetFileDescriptor.class, (Class)Bitmap.class, (ddr)new dkx(a2, (dkv)new dku(1)));
                dcg.g((Class)Bitmap.class, (Class)Bitmap.class, (dik)diw.a);
                dcg.h("Bitmap", (Class)Bitmap.class, (Class)Bitmap.class, (ddr)new dlg(1));
                dcg.e((Class)Bitmap.class, (dds)dji);
                dcg.h("BitmapDrawable", (Class)ByteBuffer.class, (Class)BitmapDrawable.class, (ddr)new djg(resources, (ddr)djm));
                dcg.h("BitmapDrawable", (Class)InputStream.class, (Class)BitmapDrawable.class, (ddr)new djg(resources, (ddr)o));
                dcg.h("BitmapDrawable", (Class)ParcelFileDescriptor.class, (Class)BitmapDrawable.class, (ddr)new djg(resources, (ddr)dkx));
                dcg.e((Class)BitmapDrawable.class, (dds)new djh(a2, (dds)dji));
                dcg.h("Animation", (Class)InputStream.class, (Class)dlj.class, (ddr)new dlr(b2, (ddr)dlh, c2));
                dcg.h("Animation", (Class)ByteBuffer.class, (Class)dlj.class, (ddr)dlh);
                dcg.e((Class)dlj.class, (dds)new dlk());
                dcg.g((Class)dcu.class, (Class)dcu.class, (dik)diw.a);
                dcg.h("Bitmap", (Class)dcu.class, (Class)Bitmap.class, (ddr)new djm(a2, 6));
                dcg.f((Class)Uri.class, (Class)Drawable.class, (ddr)dlf);
                dcg.f((Class)Uri.class, (Class)Bitmap.class, (ddr)new dkp(dlf, a2, 1));
                dcg.l((ddz)new dky());
                dcg.g((Class)File.class, (Class)ByteBuffer.class, (dik)new dhq(2));
                dcg.g((Class)File.class, (Class)InputStream.class, (dik)new dhu((dhw)new dhx(0), 0));
                dcg.f((Class)File.class, (Class)File.class, (ddr)new dlg(2));
                dcg.g((Class)File.class, (Class)ParcelFileDescriptor.class, (dik)new dhu((dhw)new dhx(1), 0));
                dcg.g((Class)File.class, (Class)File.class, (dik)diw.a);
                dcg.l((ddz)new dei(c2));
                if (dem.d()) {
                    dcg.l((ddz)new del());
                }
                dcg.g((Class)Integer.TYPE, (Class)InputStream.class, (dik)dip);
                dcg.g((Class)Integer.TYPE, (Class)ParcelFileDescriptor.class, (dik)dip3);
                dcg.g((Class)Integer.class, (Class)InputStream.class, (dik)dip);
                dcg.g((Class)Integer.class, (Class)ParcelFileDescriptor.class, (dik)dip3);
                dcg.g((Class)Integer.class, (Class)Uri.class, (dik)dip2);
                dcg.g((Class)Integer.TYPE, (Class)AssetFileDescriptor.class, (dik)dip4);
                dcg.g((Class)Integer.class, (Class)AssetFileDescriptor.class, (dik)dip4);
                dcg.g((Class)Integer.TYPE, (Class)Uri.class, (dik)dip2);
                dcg.g((Class)String.class, (Class)InputStream.class, (dik)new dhu(1, (byte[])null));
                dcg.g((Class)Uri.class, (Class)InputStream.class, (dik)new dhu(1, (byte[])null));
                dcg.g((Class)String.class, (Class)InputStream.class, (dik)new dhq(5));
                dcg.g((Class)String.class, (Class)ParcelFileDescriptor.class, (dik)new dhq(4));
                dcg.g((Class)String.class, (Class)AssetFileDescriptor.class, (dik)new dhq(3));
                dcg.g((Class)Uri.class, (Class)InputStream.class, (dik)new dhm(applicationContext.getAssets(), 0));
                dcg.g((Class)Uri.class, (Class)AssetFileDescriptor.class, (dik)new dhm(applicationContext.getAssets(), 1));
                dcg.g((Class)Uri.class, (Class)InputStream.class, (dik)new dip(applicationContext, 6));
                dcg.g((Class)Uri.class, (Class)InputStream.class, (dik)new dip(applicationContext, 7));
                if (Build$VERSION.SDK_INT >= 29) {
                    dcg.g((Class)Uri.class, (Class)InputStream.class, (dik)new diz(applicationContext, (Class)InputStream.class));
                    dcg.g((Class)Uri.class, (Class)ParcelFileDescriptor.class, (dik)new diz(applicationContext, (Class)ParcelFileDescriptor.class));
                }
                dcg.g((Class)Uri.class, (Class)InputStream.class, (dik)new dit(contentResolver, 2));
                dcg.g((Class)Uri.class, (Class)ParcelFileDescriptor.class, (dik)new dit(contentResolver, 0));
                dcg.g((Class)Uri.class, (Class)AssetFileDescriptor.class, (dik)new dit(contentResolver, 1));
                dcg.g((Class)Uri.class, (Class)InputStream.class, (dik)new diw(0));
                dcg.g((Class)URL.class, (Class)InputStream.class, (dik)new diw(2));
                dcg.g((Class)Uri.class, (Class)File.class, (dik)new dip(applicationContext, 1));
                dcg.g((Class)dhz.class, (Class)InputStream.class, (dik)new dip(5));
                dcg.g((Class)byte[].class, (Class)ByteBuffer.class, (dik)new dhq(1));
                dcg.g((Class)byte[].class, (Class)InputStream.class, (dik)new dhq(0));
                dcg.g((Class)Uri.class, (Class)Uri.class, (dik)diw.a);
                dcg.g((Class)Drawable.class, (Class)Drawable.class, (dik)diw.a);
                dcg.f((Class)Drawable.class, (Class)Drawable.class, (ddr)new dlg(0));
                dcg.m((Class)Bitmap.class, (Class)BitmapDrawable.class, (dlu)new dls(resources, 0));
                dcg.m((Class)Bitmap.class, (Class)byte[].class, (dlu)dls);
                dcg.m((Class)Drawable.class, (Class)byte[].class, (dlu)new dlt(a2, (dlu)dls, (dlu)dlv));
                dcg.m((Class)dlj.class, (Class)byte[].class, (dlu)dlv);
                final dkx dkx2 = new dkx(a2, (dkv)new dku(0));
                dcg.f((Class)ByteBuffer.class, (Class)Bitmap.class, (ddr)dkx2);
                dcg.f((Class)ByteBuffer.class, (Class)BitmapDrawable.class, (ddr)new djg(resources, (ddr)dkx2));
                cjl.d(applicationContext, a, dcg, b, c);
                return dcg;
            }
            finally {}
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }
}
