import java.net.HttpURLConnection;
import android.database.Cursor;
import android.os.Build$VERSION;
import com.google.protos.youtube.api.innertube.SaveImageToDeviceEndpointOuterClass;
import java.io.OutputStream;
import android.graphics.Bitmap;
import android.graphics.Bitmap$CompressFormat;
import android.content.ContentValues;
import java.io.IOException;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import org.chromium.net.CronetEngine;
import java.net.URLConnection;
import java.net.URL;
import java.io.File;
import android.net.Uri;
import android.provider.MediaStore$Images$Media;
import java.util.Map;
import android.app.Activity;
import android.os.Handler;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goz implements vau
{
    private static final amxn d;
    public final vax a;
    public final Executor b;
    final uyi c;
    private final Context e;
    private final atjj f;
    private final Handler g;
    private final acyh h;
    private final acsm i;
    private final Activity j;
    
    static {
        final agza builder = ((agzi)amxn.a).createBuilder();
        final amxm i = amxm.i;
        builder.copyOnWrite();
        final amxn amxn = (amxn)builder.instance;
        amxn.c = i.m;
        amxn.b |= 0x1;
        d = (amxn)builder.build();
    }
    
    public goz(final Context e, final atjj f, final vax a, final Executor b, final Handler g, final acyh h, final acsm i, final Activity j, final uyi c) {
        e.getClass();
        this.e = e;
        this.f = f;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.g = g;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = j;
        this.c = c;
    }
    
    public final void b(final boolean b, final aioe aioe, final Map map) {
        if (b) {
            this.g.post((Runnable)new gox(this, aioe, map, 1));
        }
    }
    
    public final void c(anua anua, final Map map) {
        int c = anua.c;
        Object i;
        if (c == 1) {
            i = anua.d;
            c = 1;
        }
        else {
            i = null;
        }
        Object o;
        if (c == 8) {
            o = anua.d;
        }
        else {
            o = null;
        }
        int n = anua.b;
        String e;
        if ((n & 0x4) != 0x0) {
            e = anua.e;
        }
        else {
            e = null;
        }
        String f;
        if ((n & 0x8) != 0x0) {
            f = anua.f;
        }
        else {
            f = null;
        }
        int bj;
        if ((n & 0x10) != 0x0) {
            if ((bj = aqql.bJ(anua.g)) == 0) {
                bj = 1;
            }
        }
        else {
            bj = 2;
        }
        int h;
        if ((n & 0x20) != 0x0) {
            h = anua.h;
        }
        else {
            h = 100;
        }
        Object o2 = null;
        if (!aexs.f(e)) {
            if (!aexs.f(f)) {
                o2 = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
                try {
                    o2 = this.e.getContentResolver().query((Uri)o2, new String[] { "_data" }, "title=? AND description=?", new String[] { e, f }, (String)null);
                    Label_0310: {
                        if (o2 != null) {
                            try {
                                if (((Cursor)o2).moveToFirst()) {
                                    n = ((Cursor)o2).getColumnIndex("_data");
                                    if (n != -1 && new File(((Cursor)o2).getString(n)).exists()) {
                                        n = 1;
                                        break Label_0310;
                                    }
                                }
                            }
                            finally {
                                try {
                                    ((Cursor)o2).close();
                                }
                                finally {
                                    final Throwable t;
                                    gow.a(t, (Throwable)o2);
                                }
                            }
                        }
                        n = 0;
                    }
                    if (o2 != null) {
                        ((Cursor)o2).close();
                    }
                    if (n != 0) {
                        final boolean b = (anua.b & 0x40) != 0x0;
                        i = anua.i;
                        if ((anua = (anua)i) == null) {
                            anua = (anua)aioe.a;
                        }
                        this.b(b, (aioe)anua, map);
                        return;
                    }
                }
                catch (final SecurityException ex) {}
            }
        }
        Bitmap bitmap = null;
        Label_0534: {
            Bitmap c2 = null;
            Label_0387: {
                if (o == null) {
                    Label_0937: {
                        try {
                            o = new URL((String)i);
                            o = ((CronetEngine)this.f.a()).openConnection((URL)o);
                            try {
                                try {
                                    BitmapFactory.decodeStream((InputStream)new BufferedInputStream(((URLConnection)o).getInputStream()));
                                    if (o != null) {
                                        ((HttpURLConnection)o).disconnect();
                                    }
                                    break Label_0387;
                                }
                                finally {}
                            }
                            catch (final IOException o2) {}
                        }
                        catch (final IOException o2) {
                            o = null;
                        }
                        finally {
                            c2 = null;
                            break Label_0937;
                        }
                        zjp.c(zjo.a, zjn.a, "SaveImageToDeviceCommand: Unable to download the image", (Throwable)o2);
                        if (o != null) {
                            ((HttpURLConnection)o).disconnect();
                        }
                        bitmap = null;
                        break Label_0534;
                    }
                    if (c2 != null) {
                        ((HttpURLConnection)c2).disconnect();
                    }
                    throw anua;
                }
                c2 = adbp.c((agyc)o);
            }
            bitmap = c2;
        }
        if (bitmap == null) {
            final boolean b2 = (anua.b & 0x80) != 0x0;
            aioe aioe;
            if ((aioe = anua.j) == null) {
                aioe = aioe.a;
            }
            this.b(b2, aioe, map);
            return;
        }
        Uri insert;
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("title", e);
            contentValues.put("description", f);
            insert = this.e.getContentResolver().insert(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        catch (final SecurityException ex2) {
            zjp.c(zjo.a, zjn.a, "SaveImageToDeviceCommand: Unable to add image to Media Store", (Throwable)ex2);
            insert = null;
        }
        if (insert == null) {
            final boolean b3 = (anua.b & 0x80) != 0x0;
            aioe aioe2;
            if ((aioe2 = anua.j) == null) {
                aioe2 = aioe.a;
            }
            this.b(b3, aioe2, map);
            return;
        }
        Label_0875: {
            try {
                final OutputStream openOutputStream = this.e.getContentResolver().openOutputStream(insert);
                Label_0750: {
                    if (--bj == 2) {
                        break Label_0750;
                    }
                    Label_0742: {
                        if (bj == 3) {
                            break Label_0742;
                        }
                        try {
                            Bitmap$CompressFormat bitmap$CompressFormat = Bitmap$CompressFormat.JPEG;
                            while (true) {
                                final boolean compress = bitmap.compress(bitmap$CompressFormat, h, openOutputStream);
                                if (openOutputStream != null) {
                                    openOutputStream.close();
                                }
                                if (!compress) {
                                    break Label_0875;
                                }
                                final boolean b4 = (anua.b & 0x40) != 0x0;
                                if ((anua = (anua)anua.i) == null) {
                                    anua = (anua)aioe.a;
                                }
                                this.b(b4, (aioe)anua, map);
                                return;
                                bitmap$CompressFormat = Bitmap$CompressFormat.PNG;
                                continue;
                            }
                            bitmap$CompressFormat = Bitmap$CompressFormat.WEBP;
                        }
                        finally {
                            if (openOutputStream != null) {
                                try {
                                    openOutputStream.close();
                                }
                                finally {
                                    final Throwable t2;
                                    final Throwable t3;
                                    gow.a(t2, t3);
                                }
                            }
                        }
                    }
                }
            }
            catch (final IOException ex3) {
                zjp.c(zjo.a, zjn.a, "SaveImageToDeviceCommand: Unable to write image on device", (Throwable)ex3);
            }
        }
        this.e.getContentResolver().delete(insert, (String)null, (String[])null);
        final boolean b5 = (anua.b & 0x80) != 0x0;
        aioe aioe3;
        if ((aioe3 = anua.j) == null) {
            aioe3 = aioe.a;
        }
        this.b(b5, aioe3, map);
    }
    
    public final void mE(aioe aioe, final Map map) {
        if (!((agzd)aioe).rs((agyr)SaveImageToDeviceEndpointOuterClass.saveImageToDeviceEndpoint)) {
            return;
        }
        final anua anua = (anua)((agzd)aioe).rr((agyr)SaveImageToDeviceEndpointOuterClass.saveImageToDeviceEndpoint);
        final acyh h = this.h;
        final amxn d = goz.d;
        if (h.d(d) || (this.c.f(45383388L) && Build$VERSION.SDK_INT >= 29)) {
            this.b.execute((Runnable)new vo(this, anua, map, 20));
            return;
        }
        final acsm i = this.i;
        final Activity j = this.j;
        boolean b = false;
        if (i.l(j, 0)) {
            if ((anua.b & 0x80) != 0x0) {
                b = true;
            }
            if ((aioe = anua.j) == null) {
                aioe = aioe.a;
            }
            this.b(b, aioe, map);
            return;
        }
        this.i.d(acsm.p(this.e, 0));
        this.h.e(d, new goy(this, anua, map));
    }
}
