import android.database.Cursor;
import android.util.SparseBooleanArray;
import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build$VERSION;
import android.graphics.BitmapFactory$Options;
import android.provider.MediaStore$Images$Thumbnails;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.provider.MediaStore$Images$Media;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class hg implements Runnable
{
    final /* synthetic */ hh a;
    
    public hg(final hh a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        while (true) {
            final hi j = this.a.c.j();
            if (j == null) {
                break;
            }
            final int b = j.b;
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            final StringBuilder sb = new StringBuilder("Unsupported message, what=");
                            sb.append(j.b);
                            Log.e("ThreadUtil", sb.toString());
                        }
                        else {
                            final Object h = j.h;
                            final gv gv = (gv)this.a.b;
                            final gw f = gv.f;
                            final rk g = (rk)h;
                            final Object c = g.c;
                            final int a = g.a;
                            g.d = gv.g;
                            gv.g = g;
                        }
                    }
                    else {
                        final hj b2 = this.a.b;
                        final int c2 = j.c;
                        final int d = j.d;
                        final gv gv2 = (gv)b2;
                        if (gv2.a.get(c2)) {
                            continue;
                        }
                        rk g2 = gv2.g;
                        if (g2 != null) {
                            gv2.g = (rk)g2.d;
                        }
                        else {
                            final gw f2 = gv2.f;
                            g2 = new rk(f2.a, f2.b);
                        }
                        g2.b = c2;
                        final int min = Math.min(gv2.f.b, gv2.c - c2);
                        g2.a = min;
                        final bkh n = gv2.f.n;
                        final Object c3 = g2.c;
                        final int b3 = g2.b;
                        final sob[] array = (sob[])c3;
                        final Object b4 = n.b;
                        if (b4 != null) {
                            final int columnIndexOrThrow = ((Cursor)b4).getColumnIndexOrThrow("_id");
                            final int columnIndexOrThrow2 = ((Cursor)n.b).getColumnIndexOrThrow("_size");
                            final int columnIndexOrThrow3 = ((Cursor)n.b).getColumnIndexOrThrow("width");
                            final int columnIndexOrThrow4 = ((Cursor)n.b).getColumnIndexOrThrow("height");
                            final int columnIndexOrThrow5 = ((Cursor)n.b).getColumnIndexOrThrow("orientation");
                            for (int i = 0; i < min; ++i) {
                                ((Cursor)n.b).moveToPosition(b3 + i);
                                final long long1 = ((Cursor)n.b).getLong(columnIndexOrThrow);
                                final Uri withAppendedId = ContentUris.withAppendedId(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, long1);
                                final Bitmap thumbnail = MediaStore$Images$Thumbnails.getThumbnail((ContentResolver)n.a, long1, 1, (BitmapFactory$Options)null);
                                final long long2 = ((Cursor)n.b).getLong(columnIndexOrThrow2);
                                final int int1 = ((Cursor)n.b).getInt(columnIndexOrThrow3);
                                final int int2 = ((Cursor)n.b).getInt(columnIndexOrThrow4);
                                final int int3 = ((Cursor)n.b).getInt(columnIndexOrThrow5);
                                Bitmap bitmap;
                                if (int3 != 0 && thumbnail != null) {
                                    bitmap = thumbnail;
                                    if (Build$VERSION.SDK_INT < 29) {
                                        final Matrix matrix = new Matrix();
                                        matrix.postRotate((float)int3);
                                        bitmap = Bitmap.createBitmap(thumbnail, 0, 0, thumbnail.getWidth(), thumbnail.getHeight(), matrix, true);
                                    }
                                }
                                else {
                                    bitmap = thumbnail;
                                }
                                array[i] = new sob(withAppendedId, bitmap, long2, int1, int2, int3, false);
                            }
                        }
                        final gw f3 = gv2.f;
                        while (gv2.a.size() >= 10) {
                            final int key = gv2.a.keyAt(0);
                            final SparseBooleanArray a2 = gv2.a;
                            final int key2 = a2.keyAt(a2.size() - 1);
                            final int n2 = gv2.d - key;
                            final int n3 = key2 - gv2.e;
                            if (n2 > 0 && (n2 >= n3 || d == 2)) {
                                gv2.b(key);
                            }
                            else {
                                if (n3 <= 0 || (n2 >= n3 && d != 1)) {
                                    break;
                                }
                                gv2.b(key2);
                            }
                        }
                        gv2.a.put(g2.b, true);
                        ((hf)gv2.f.c).a(hi.b(2, gv2.b, (Object)g2));
                    }
                }
                else {
                    this.a.c.k(2);
                    this.a.c.k(3);
                    final hj b5 = this.a.b;
                    final int c4 = j.c;
                    final int d2 = j.d;
                    final int e = j.e;
                    final int f4 = j.f;
                    final int g3 = j.g;
                    if (c4 > d2) {
                        continue;
                    }
                    final gv gv3 = (gv)b5;
                    final int a3 = gv3.a(c4);
                    final int a4 = gv3.a(d2);
                    gv3.d = gv3.a(e);
                    final int a5 = gv3.a(f4);
                    gv3.e = a5;
                    if (g3 == 1) {
                        gv3.c(gv3.d, a4, 1, true);
                        gv3.c(a4 + gv3.f.b, gv3.e, 1, false);
                    }
                    else {
                        gv3.c(a3, a5, g3, false);
                        gv3.c(gv3.d, a3 - gv3.f.b, g3, true);
                    }
                }
            }
            else {
                this.a.c.k(1);
                final hj b6 = this.a.b;
                final int c5 = j.c;
                final gv gv4 = (gv)b6;
                gv4.b = c5;
                gv4.a.clear();
                final Object b7 = gv4.f.n.b;
                int count;
                if (b7 == null) {
                    count = 0;
                }
                else {
                    count = ((Cursor)b7).getCount();
                }
                gv4.c = count;
                ((hf)gv4.f.c).a(hi.a(1, gv4.b, count));
            }
        }
        this.a.a.set(false);
    }
}
