import java.util.Iterator;
import android.database.MatrixCursor;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.content.ContentValues;
import android.webkit.MimeTypeMap;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.content.pm.ProviderInfo;
import org.xmlpull.v1.XmlPullParserException;
import android.text.TextUtils;
import android.os.Environment;
import java.io.IOException;
import android.net.Uri$Builder;
import java.util.Map;
import android.net.Uri;
import android.content.Context;
import java.util.HashMap;
import java.io.File;
import android.content.ContentProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public class ahc extends ContentProvider
{
    private static final String[] a;
    private static final File b;
    private static final HashMap c;
    private kg d;
    
    static {
        a = new String[] { "_display_name", "_size" };
        b = new File("/");
        c = new HashMap();
    }
    
    public static Uri a(final Context context, String s, File iterator) {
        final kg b = b(context, s);
        try {
            final String canonicalPath = iterator.getCanonicalPath();
            iterator = (File)((HashMap)b.a).entrySet().iterator();
            Object o = null;
            while (((Iterator)iterator).hasNext()) {
                final Map.Entry<K, File> entry = ((Iterator<Map.Entry<K, File>>)iterator).next();
                final String path = entry.getValue().getPath();
                if (canonicalPath.startsWith(path) && (o == null || path.length() > ((Map.Entry<K, File>)o).getValue().getPath().length())) {
                    o = entry;
                }
            }
            if (o != null) {
                s = ((Map.Entry<K, File>)o).getValue().getPath();
                if (s.endsWith("/")) {
                    s = canonicalPath.substring(s.length());
                }
                else {
                    s = canonicalPath.substring(s.length() + 1);
                }
                iterator = (File)new StringBuilder();
                ((StringBuilder)iterator).append(Uri.encode((String)((Map.Entry)o).getKey()));
                ((StringBuilder)iterator).append('/');
                ((StringBuilder)iterator).append(Uri.encode(s, "/"));
                return new Uri$Builder().scheme("content").authority((String)b.b).encodedPath(((StringBuilder)iterator).toString()).build();
            }
            throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
        }
        catch (final IOException ex) {
            new StringBuilder("Failed to resolve canonical path for ").append(iterator);
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(iterator)));
        }
    }
    
    private static kg b(final Context context, final String s) {
        final HashMap c = ahc.c;
        monitorenter(c);
        try {
            kg kg;
            if ((kg = c.get(s)) == null) {
                try {
                    final kg kg2 = new kg(s);
                    final ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(s, 128);
                    if (resolveContentProvider == null) {
                        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(s)));
                    }
                    final Bundle metaData = resolveContentProvider.metaData;
                    final XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                    if (loadXmlMetaData == null) {
                        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                    }
                    Label_0457: {
                        while (true) {
                            final int next = loadXmlMetaData.next();
                            if (next == 1) {
                                break Label_0457;
                            }
                            if (next != 2) {
                                continue;
                            }
                            final String name = loadXmlMetaData.getName();
                            final File file = null;
                            final String attributeValue = loadXmlMetaData.getAttributeValue((String)null, "name");
                            final String attributeValue2 = loadXmlMetaData.getAttributeValue((String)null, "path");
                            final boolean equals = "root-path".equals(name);
                            int i = 0;
                            File file2;
                            if (equals) {
                                file2 = ahc.b;
                            }
                            else if ("files-path".equals(name)) {
                                file2 = context.getFilesDir();
                            }
                            else if ("cache-path".equals(name)) {
                                file2 = context.getCacheDir();
                            }
                            else if ("external-path".equals(name)) {
                                file2 = Environment.getExternalStorageDirectory();
                            }
                            else if ("external-files-path".equals(name)) {
                                final File[] h = td.h(context);
                                file2 = file;
                                if (h.length > 0) {
                                    file2 = h[0];
                                }
                            }
                            else if ("external-cache-path".equals(name)) {
                                final File[] a = agv.a(context);
                                file2 = file;
                                if (a.length > 0) {
                                    file2 = a[0];
                                }
                            }
                            else {
                                file2 = file;
                                if ("external-media-path".equals(name)) {
                                    final File[] a2 = ahb.a(context);
                                    file2 = file;
                                    if (a2.length > 0) {
                                        file2 = a2[0];
                                    }
                                }
                            }
                            if (file2 == null) {
                                continue;
                            }
                            while (i <= 0) {
                                final String s2 = (new String[] { attributeValue2 })[i];
                                File file3 = file2;
                                if (s2 != null) {
                                    file3 = new File(file2, s2);
                                }
                                ++i;
                                file2 = file3;
                            }
                            if (!TextUtils.isEmpty((CharSequence)attributeValue)) {
                                try {
                                    ((HashMap)kg2.a).put(attributeValue, file2.getCanonicalFile());
                                    continue;
                                }
                                catch (final IOException ex) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Failed to resolve canonical path for ");
                                    sb.append(file2);
                                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()), ex);
                                }
                                break;
                            }
                            break;
                        }
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    ahc.c.put(s, kg2);
                    kg = kg2;
                }
                catch (final XmlPullParserException ex2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", (Throwable)ex2);
                }
                catch (final IOException ex3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ex3);
                }
            }
            monitorexit(c);
            return kg;
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public void attachInfo(final Context context, ProviderInfo c) {
        super.attachInfo(context, c);
        if (!c.exported) {
            if (c.grantUriPermissions) {
                final String s = c.authority.split(";")[0];
                c = (ProviderInfo)ahc.c;
                synchronized (c) {
                    ((HashMap<Object, Object>)c).remove(s);
                    monitorexit(c);
                    this.d = b(context, s);
                    return;
                }
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        if (this.d.E(uri).delete()) {
            return 1;
        }
        return 0;
    }
    
    public final String getType(final Uri uri) {
        final File e = this.d.E(uri);
        final int lastIndex = e.getName().lastIndexOf(46);
        if (lastIndex >= 0) {
            final String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(e.getName().substring(lastIndex + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }
    
    public final boolean onCreate() {
        return true;
    }
    
    public final ParcelFileDescriptor openFile(final Uri uri, final String s) {
        final File e = this.d.E(uri);
        int n;
        if ("r".equals(s)) {
            n = 268435456;
        }
        else if (!"w".equals(s) && !"wt".equals(s)) {
            if ("wa".equals(s)) {
                n = 704643072;
            }
            else if ("rw".equals(s)) {
                n = 939524096;
            }
            else {
                if (!"rwt".equals(s)) {
                    throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(s)));
                }
                n = 1006632960;
            }
        }
        else {
            n = 738197504;
        }
        return ParcelFileDescriptor.open(e, n);
    }
    
    public final Cursor query(final Uri uri, final String[] array, String queryParameter, final String[] array2, final String s) {
        final File e = this.d.E(uri);
        queryParameter = uri.getQueryParameter("displayName");
        String[] a = array;
        if (array == null) {
            a = ahc.a;
        }
        final int length = a.length;
        final String[] array3 = new String[length];
        final Object[] array4 = new Object[length];
        int i = 0;
        int n = 0;
        while (i < length) {
            final String s2 = a[i];
            int n4 = 0;
            Label_0161: {
                int n3;
                if ("_display_name".equals(s2)) {
                    array3[n] = "_display_name";
                    final int n2 = n + 1;
                    String name;
                    if (queryParameter == null) {
                        name = e.getName();
                    }
                    else {
                        name = queryParameter;
                    }
                    array4[n] = name;
                    n3 = n2;
                }
                else {
                    n4 = n;
                    if (!"_size".equals(s2)) {
                        break Label_0161;
                    }
                    array3[n] = "_size";
                    final int n5 = n + 1;
                    array4[n] = e.length();
                    n3 = n5;
                }
                n4 = n3;
            }
            ++i;
            n = n4;
        }
        final String[] array5 = new String[n];
        System.arraycopy(array3, 0, array5, 0, n);
        final Object[] array6 = new Object[n];
        System.arraycopy(array4, 0, array6, 0, n);
        final MatrixCursor matrixCursor = new MatrixCursor(array5, 1);
        matrixCursor.addRow(array6);
        return (Cursor)matrixCursor;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("No external updates");
    }
}
