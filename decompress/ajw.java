import android.content.ContentResolver;
import android.net.Uri;
import android.database.Cursor;
import android.content.pm.Signature;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ContentUris;
import android.net.Uri$Builder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.os.CancellationSignal;
import android.content.Context;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajw
{
    private static final Comparator a;
    
    static {
        a = aas.b;
    }
    
    public static arjd a(final Context context, final ajx ajx, final CancellationSignal cancellationSignal) {
        final PackageManager packageManager = context.getPackageManager();
        final Resources resources = context.getResources();
        final String a = ajx.a;
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(ajx.b)) {
                final Signature[] signatures = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                final ArrayList list = new ArrayList();
                for (int length = signatures.length, i = 0; i < length; ++i) {
                    list.add(signatures[i].toByteArray());
                }
                Collections.sort((List<Object>)list, ajw.a);
                List list2;
                if ((list2 = ajx.d) == null) {
                    list2 = tf.b(resources, ajx.e);
                }
                int n = 0;
                Cursor cursor = null;
                ProviderInfo providerInfo = null;
            Label_0274:
                while (true) {
                    final int size = list2.size();
                    cursor = null;
                    if (n >= size) {
                        providerInfo = null;
                        break;
                    }
                    final ArrayList list3 = new ArrayList<Object>(list2.get(n));
                    Collections.sort((List<E>)list3, ajw.a);
                    if (list.size() == list3.size()) {
                        int n2 = 0;
                        while (true) {
                            providerInfo = resolveContentProvider;
                            if (n2 >= list.size()) {
                                break Label_0274;
                            }
                            if (!Arrays.equals((byte[])list.get(n2), (byte[])list3.get(n2))) {
                                break;
                            }
                            ++n2;
                        }
                    }
                    ++n;
                }
                if (providerInfo == null) {
                    return arjd.q(1, null);
                }
                final String authority = providerInfo.authority;
                final ArrayList list4 = new ArrayList();
                final Uri build = new Uri$Builder().scheme("content").authority(authority).build();
                final Uri build2 = new Uri$Builder().scheme("content").authority(authority).appendPath("file").build();
                Cursor cursor2 = cursor;
                Label_0749: {
                    try {
                        final ContentResolver contentResolver = context.getContentResolver();
                        cursor2 = cursor;
                        final String c = ajx.c;
                        cursor2 = cursor;
                        final Cursor a2 = ajv.a(contentResolver, build, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { c }, null, cancellationSignal);
                        ArrayList<ogz> list5 = list4;
                        if (a2 == null) {
                            break Label_0749;
                        }
                        cursor2 = a2;
                        list5 = list4;
                        if (a2.getCount() <= 0) {
                            break Label_0749;
                        }
                        cursor2 = a2;
                        final int columnIndex = a2.getColumnIndex("result_code");
                        cursor2 = a2;
                        cursor2 = a2;
                        final ArrayList<ogz> list6 = new ArrayList<ogz>();
                        cursor2 = a2;
                        final int columnIndex2 = a2.getColumnIndex("_id");
                        cursor2 = a2;
                        final int columnIndex3 = a2.getColumnIndex("file_id");
                        cursor2 = a2;
                        final int columnIndex4 = a2.getColumnIndex("font_ttc_index");
                        cursor2 = a2;
                        final int columnIndex5 = a2.getColumnIndex("font_weight");
                        cursor2 = a2;
                        final int columnIndex6 = a2.getColumnIndex("font_italic");
                        while (true) {
                            cursor2 = a2;
                            list5 = list6;
                            if (!a2.moveToNext()) {
                                break Label_0749;
                            }
                            int int1;
                            if (columnIndex != -1) {
                                cursor2 = a2;
                                int1 = a2.getInt(columnIndex);
                            }
                            else {
                                int1 = 0;
                            }
                            int int2;
                            if (columnIndex4 != -1) {
                                cursor2 = a2;
                                int2 = a2.getInt(columnIndex4);
                            }
                            else {
                                int2 = 0;
                            }
                            Uri uri;
                            if (columnIndex3 == -1) {
                                cursor2 = a2;
                                uri = ContentUris.withAppendedId(build, a2.getLong(columnIndex2));
                            }
                            else {
                                cursor2 = a2;
                                uri = ContentUris.withAppendedId(build2, a2.getLong(columnIndex3));
                            }
                            int int3;
                            if (columnIndex5 != -1) {
                                cursor2 = a2;
                                int3 = a2.getInt(columnIndex5);
                            }
                            else {
                                int3 = 400;
                            }
                            boolean b = false;
                            Label_0708: {
                                if (columnIndex6 != -1) {
                                    cursor2 = a2;
                                    if (a2.getInt(columnIndex6) == 1) {
                                        b = true;
                                        break Label_0708;
                                    }
                                }
                                b = false;
                            }
                            cursor2 = a2;
                            cursor2 = a2;
                            final ogz ogz = new ogz(uri, int2, int3, b, int1);
                            cursor2 = a2;
                            list6.add(ogz);
                        }
                    }
                    finally {
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        while (true) {
                            final Cursor a2;
                            a2.close();
                            Label_0759: {
                                final ArrayList<ogz> list5;
                                return arjd.q(0, list5.toArray(new ogz[0]));
                            }
                            iftrue(Label_0759:)(a2 == null);
                            continue;
                        }
                    }
                }
            }
            final StringBuilder sb = new StringBuilder("Found content provider ");
            sb.append(a);
            sb.append(", but package was not ");
            sb.append(ajx.b);
            throw new PackageManager$NameNotFoundException(sb.toString());
        }
        throw new PackageManager$NameNotFoundException("No package found for authority: ".concat(a));
    }
}
