import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import android.widget.ImageView$ScaleType;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import android.text.style.TextAppearanceSpan;
import android.text.Annotation;
import android.text.SpannableString;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.text.Spanned;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.LayerDrawable;
import java.util.Locale;
import android.widget.RatingBar;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.os.Handler;
import android.content.res.Resources;
import android.os.Parcelable$Creator;
import java.util.List;
import android.os.IBinder;
import android.os.Bundle;
import com.google.android.gms.googlehelp.InProductHelp;
import android.os.Parcel;
import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import android.util.Base64;
import android.util.Log;
import android.content.pm.PackageManager;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khl
{
    public static Boolean a;
    public static Boolean b;
    private static Boolean c;
    private static Boolean d;
    
    public static final Class[] A(final jwv jwv, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { hyu.class };
        }
        if (n == 0) {
            jwv.b((hyu)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static boolean B() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
    
    public static boolean C() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    public static boolean D() {
        return Build$VERSION.SDK_INT >= 30;
    }
    
    public static int E(final int n) {
        if (n == -1) {
            return -1;
        }
        return n / 1000;
    }
    
    public static boolean F(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (khl.c == null) {
            khl.c = packageManager.hasSystemFeature("android.hardware.type.watch");
        }
        return khl.c;
    }
    
    public static boolean G(final Context context) {
        F(context);
        if (khl.d == null) {
            khl.d = context.getPackageManager().hasSystemFeature("cn.google");
        }
        return khl.d && D();
    }
    
    public static void H(final Context context) {
        try {
            aP(context);
        }
        catch (final Exception ex) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", (Throwable)ex);
        }
    }
    
    public static String I(final byte[] array) {
        if (array == null) {
            return null;
        }
        return Base64.encodeToString(array, 11);
    }
    
    public static ArrayList J() {
        return new ArrayList();
    }
    
    public static boolean K(final int[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static void L(final SafeParcelable safeParcelable, final Intent intent) {
        final Parcel obtain = Parcel.obtain();
        mvv.b((InProductHelp)safeParcelable, obtain, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("EXTRA_IN_PRODUCT_HELP", marshall);
    }
    
    public static int M(final Parcel parcel) {
        return bl(parcel, 20293);
    }
    
    public static void N(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(n - 4);
        parcel.writeInt(dataPosition - n);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void O(final Parcel parcel, final int n, final boolean b) {
        R(parcel, n, 4);
        parcel.writeInt((int)(b ? 1 : 0));
    }
    
    public static void P(final Parcel parcel, final int n, final double n2) {
        R(parcel, n, 8);
        parcel.writeDouble(n2);
    }
    
    public static void Q(final Parcel parcel, final int n, final float n2) {
        R(parcel, n, 4);
        parcel.writeFloat(n2);
    }
    
    public static void R(final Parcel parcel, final int n, final int n2) {
        parcel.writeInt(n | n2 << 16);
    }
    
    public static void S(final Parcel parcel, final int n, final int n2) {
        R(parcel, n, 4);
        parcel.writeInt(n2);
    }
    
    public static void T(final Parcel parcel, final int n, final long n2) {
        R(parcel, n, 8);
        parcel.writeLong(n2);
    }
    
    public static void U(final Parcel parcel, final int n, final Boolean b) {
        if (b == null) {
            return;
        }
        R(parcel, n, 4);
        parcel.writeInt((int)(((boolean)b) ? 1 : 0));
    }
    
    public static void V(final Parcel parcel, int bl, final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcel.writeBundle(bundle);
        N(parcel, bl);
    }
    
    public static void W(final Parcel parcel, int bl, final byte[] array) {
        if (array == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcel.writeByteArray(array);
        N(parcel, bl);
    }
    
    public static void X(final Parcel parcel, int i, final byte[][] array) {
        if (array == null) {
            return;
        }
        final int bl = bl(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        for (i = 0; i < length; ++i) {
            parcel.writeByteArray(array[i]);
        }
        N(parcel, bl);
    }
    
    public static void Y(final Parcel parcel, int bl, final IBinder binder) {
        if (binder == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcel.writeStrongBinder(binder);
        N(parcel, bl);
    }
    
    public static void Z(final Parcel parcel, int bl, final int[] array) {
        if (array == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcel.writeIntArray(array);
        N(parcel, bl);
    }
    
    public static int a(final List list, final int n) {
        for (int i = 0; i < list.size(); ++i) {
            int bk;
            if ((bk = adyf.bk(list.get(i).c)) == 0) {
                bk = 1;
            }
            if (bk == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static ArrayList aA(final Parcel parcel, int i) {
        final int aq = aq(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final ArrayList list = new ArrayList();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + aq);
        return list;
    }
    
    public static ArrayList aB(final Parcel parcel, int i) {
        final int aq = aq(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final ArrayList list = new ArrayList();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + aq);
        return list;
    }
    
    public static ArrayList aC(final Parcel parcel, int aq) {
        aq = aq(parcel, aq);
        final int dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + aq);
        return stringArrayList;
    }
    
    public static ArrayList aD(final Parcel parcel, int aq, final Parcelable$Creator parcelable$Creator) {
        aq = aq(parcel, aq);
        final int dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList(parcelable$Creator);
        parcel.setDataPosition(dataPosition + aq);
        return typedArrayList;
    }
    
    public static void aE(final Parcel parcel, final int n) {
        if (parcel.dataPosition() == n) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Overread allowed size end=");
        sb.append(n);
        throw new mvd(sb.toString(), parcel);
    }
    
    public static void aF(final Parcel parcel, int aq) {
        aq = aq(parcel, aq);
        parcel.setDataPosition(parcel.dataPosition() + aq);
    }
    
    public static boolean aG(final Parcel parcel, final int n) {
        bn(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    public static byte[] aH(final Parcel parcel, int dataPosition) {
        final int aq = aq(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + aq);
        return byteArray;
    }
    
    public static int[] aI(final Parcel parcel, int aq) {
        aq = aq(parcel, aq);
        final int dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + aq);
        return intArray;
    }
    
    public static long[] aJ(final Parcel parcel, int dataPosition) {
        final int aq = aq(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final long[] longArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + aq);
        return longArray;
    }
    
    public static Object[] aK(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int aq = aq(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray(parcelable$Creator);
        parcel.setDataPosition(dataPosition + aq);
        return typedArray;
    }
    
    public static String[] aL(final Parcel parcel, int dataPosition) {
        final int aq = aq(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + aq);
        return stringArray;
    }
    
    public static byte[][] aM(final Parcel parcel, int i) {
        final int aq = aq(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final byte[][] array = new byte[int1][];
        for (i = 0; i < int1; ++i) {
            array[i] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + aq);
        return array;
    }
    
    public static void aN(final Parcel parcel, final int n, final int n2) {
        if (n == n2) {
            return;
        }
        final String hexString = Integer.toHexString(n);
        final StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(n2);
        sb.append(" got ");
        sb.append(n);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new mvd(sb.toString(), parcel);
    }
    
    public static final String aO(final String s, final Resources resources, final String s2) {
        final int identifier = resources.getIdentifier(s, "string", s2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
    
    public static Object aP(final Object o) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException("null reference");
    }
    
    public static void aQ(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void aR(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static void aS(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(s, array));
    }
    
    public static void aT(final Handler handler) {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name;
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            else {
                name = "null current looper";
            }
            final String name2 = handler.getLooper().getThread().getName();
            final StringBuilder sb = new StringBuilder("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static void aU(final String s) {
        if (B()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void aV() {
        aW("Must not be called on the main application thread");
    }
    
    public static void aW(final String s) {
        if (!B()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void aX(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void aY(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException((String)o);
    }
    
    public static void aZ(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
    
    public static void aa(final Parcel parcel, int i, final List list) {
        if (list == null) {
            return;
        }
        final int bl = bl(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            parcel.writeInt((int)list.get(i));
        }
        N(parcel, bl);
    }
    
    public static void ab(final Parcel parcel, final int n, final Integer n2) {
        if (n2 == null) {
            return;
        }
        R(parcel, n, 4);
        parcel.writeInt((int)n2);
    }
    
    public static void ac(final Parcel parcel, int bl, final long[] array) {
        if (array == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcel.writeLongArray(array);
        N(parcel, bl);
    }
    
    public static void ad(final Parcel parcel, int i, final List list) {
        if (list == null) {
            return;
        }
        final int bl = bl(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            parcel.writeLong((long)list.get(i));
        }
        N(parcel, bl);
    }
    
    public static void ae(final Parcel parcel, final int n, final Long n2) {
        if (n2 == null) {
            return;
        }
        R(parcel, n, 8);
        parcel.writeLong((long)n2);
    }
    
    public static void af(final Parcel parcel, int bl, final Parcelable parcelable, final int n) {
        if (parcelable == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcelable.writeToParcel(parcel, n);
        N(parcel, bl);
    }
    
    public static void ag(final Parcel parcel, int bl, final String s) {
        if (s == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcel.writeString(s);
        N(parcel, bl);
    }
    
    public static void ah(final Parcel parcel, int bl, final String[] array) {
        if (array == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcel.writeStringArray(array);
        N(parcel, bl);
    }
    
    public static void ai(final Parcel parcel, int bl, final List list) {
        if (list == null) {
            return;
        }
        bl = bl(parcel, bl);
        parcel.writeStringList(list);
        N(parcel, bl);
    }
    
    public static void aj(final Parcel parcel, int i, final Parcelable[] array, final int n) {
        if (array == null) {
            return;
        }
        final int bl = bl(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcelable parcelable;
        for (i = 0; i < length; ++i) {
            parcelable = array[i];
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                bm(parcel, parcelable, n);
            }
        }
        N(parcel, bl);
    }
    
    public static void ak(final Parcel parcel, int i, final List list) {
        if (list == null) {
            return;
        }
        final int bl = bl(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        for (i = 0; i < size; ++i) {
            parcelable = list.get(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                bm(parcel, parcelable, 0);
            }
        }
        N(parcel, bl);
    }
    
    public static double al(final Parcel parcel, final int n) {
        bn(parcel, n, 8);
        return parcel.readDouble();
    }
    
    public static float am(final Parcel parcel, final int n) {
        bn(parcel, n, 4);
        return parcel.readFloat();
    }
    
    public static int an(final int n) {
        return (char)n;
    }
    
    public static int ao(final Parcel parcel) {
        return parcel.readInt();
    }
    
    public static int ap(final Parcel parcel, final int n) {
        bn(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static int aq(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return (char)(n >> 16);
        }
        return parcel.readInt();
    }
    
    public static int ar(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final int aq = aq(parcel, int1);
        final int an = an(int1);
        final int dataPosition = parcel.dataPosition();
        if (an != 20293) {
            throw new mvd("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(int1))), parcel);
        }
        final int n = aq + dataPosition;
        if (n >= dataPosition && n <= parcel.dataSize()) {
            return n;
        }
        final StringBuilder sb = new StringBuilder("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(n);
        throw new mvd(sb.toString(), parcel);
    }
    
    public static long as(final Parcel parcel, final int n) {
        bn(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static Bundle at(final Parcel parcel, int dataPosition) {
        final int aq = aq(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + aq);
        return bundle;
    }
    
    public static IBinder au(final Parcel parcel, int dataPosition) {
        final int aq = aq(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + aq);
        return strongBinder;
    }
    
    public static Parcelable av(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int aq = aq(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + aq);
        return parcelable;
    }
    
    public static Boolean aw(final Parcel parcel, int aq) {
        aq = aq(parcel, aq);
        if (aq == 0) {
            return null;
        }
        aN(parcel, aq, 4);
        return parcel.readInt() != 0;
    }
    
    public static Integer ax(final Parcel parcel, int aq) {
        aq = aq(parcel, aq);
        if (aq == 0) {
            return null;
        }
        aN(parcel, aq, 4);
        return parcel.readInt();
    }
    
    public static Long ay(final Parcel parcel, int aq) {
        aq = aq(parcel, aq);
        if (aq == 0) {
            return null;
        }
        aN(parcel, aq, 8);
        return parcel.readLong();
    }
    
    public static String az(final Parcel parcel, int aq) {
        aq = aq(parcel, aq);
        final int dataPosition = parcel.dataPosition();
        if (aq == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(dataPosition + aq);
        return string;
    }
    
    public static String b(final List list, final int n) {
        for (final ajva ajva : list) {
            int bk;
            if ((bk = adyf.bk(ajva.c)) == 0) {
                bk = 1;
            }
            if (bk == n) {
                return ajva.d;
            }
        }
        return null;
    }
    
    public static void ba(final String s, final Object o) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException((String)o);
    }
    
    public static void bb(final Object o, final Object o2) {
        if (o != null) {
            return;
        }
        throw new NullPointerException((String)o2);
    }
    
    public static nnc bc(final mrd mrd, final muz muz) {
        final nns nns = new nns();
        mrd.e((mrc)new muy(mrd, nns, muz, (byte[])null));
        return (nnc)nns.a;
    }
    
    public static void bd(final mrd mrd) {
        bc(mrd, (muz)new nok(1));
    }
    
    public static boolean be(final Object o, final Object o2) {
        boolean b = true;
        if (o != o2) {
            if (o != null) {
                if (!o.equals(o2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static final String bf(final List list, final Object o) {
        final StringBuilder sb = new StringBuilder(100);
        sb.append(o.getClass().getSimpleName());
        sb.append('{');
        for (int size = list.size(), i = 0; i < size; ++i) {
            sb.append((String)list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
    
    public static final void bg(final String s, final Object o, final List list) {
        final String value = String.valueOf(o);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("=");
        sb.append(value);
        list.add(sb.toString());
    }
    
    public static mqs bh(final Status status) {
        if (status.i != null) {
            return (mqs)new mrf(status);
        }
        return new mqs(status);
    }
    
    private static TextView bi(final View view, final ViewGroup viewGroup, final Context context, final int n) {
        final LayoutInflater from = LayoutInflater.from(context);
        TextView textView;
        if (view == null) {
            textView = (TextView)from.inflate(n, viewGroup, false);
        }
        else {
            textView = (TextView)view;
        }
        return textView;
    }
    
    private static void bj(final TextView textView, final String s, final String s2) {
        String text = s;
        if (s.isEmpty()) {
            text = s2;
        }
        textView.setText((CharSequence)text);
    }
    
    private static void bk(final TextView textView, final boolean b, final boolean b2, final Context context) {
        int textColor;
        if (b) {
            if (b2) {
                textColor = tpe.cr(context, 2130970927);
            }
            else {
                textColor = tpe.cr(context, 2130968635);
            }
        }
        else {
            textColor = tpe.cr(context, 2130968634);
        }
        textView.setTextColor(textColor);
    }
    
    private static int bl(final Parcel parcel, final int n) {
        parcel.writeInt(n | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    private static void bm(final Parcel parcel, final Parcelable parcelable, int dataPosition) {
        final int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(1);
        final int dataPosition3 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        parcel.setDataPosition(dataPosition2);
        parcel.writeInt(dataPosition - dataPosition3);
        parcel.setDataPosition(dataPosition);
    }
    
    private static void bn(final Parcel parcel, int aq, final int n) {
        aq = aq(parcel, aq);
        if (aq == n) {
            return;
        }
        final String hexString = Integer.toHexString(aq);
        final StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(n);
        sb.append(" got ");
        sb.append(aq);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new mvd(sb.toString(), parcel);
    }
    
    public static String c(final List list, final List list2, final int n) {
        final String b = b(list2, n);
        if (b != null) {
            for (final ajve ajve : list) {
                if (b.equals(ajve.e)) {
                    ajvf a;
                    if (ajve.c == 4) {
                        a = (ajvf)ajve.d;
                    }
                    else {
                        a = ajvf.a;
                    }
                    return a.c;
                }
            }
        }
        return null;
    }
    
    public static void d(final boolean b, final glq glq, final vcy vcy, final ackm ackm, final kbw kbw, final kkx kkx, final aiqj aiqj) {
        if (b && glq != null && vcy != null && ackm != null && kbw != null) {
            final aiqj d = glq.d();
            d.getClass();
            if (!kbw.c(d, vcy, ackm.a, ackm.e(), (acki)new kbq(kbw, glq, 2))) {
                kkx.p(aiqj);
            }
            return;
        }
        kkx.p(aiqj);
    }
    
    public static void e(final TextView textView, final RatingBar ratingBar, final float n, final int textColor, final int n2) {
        if (textView != null && ratingBar != null) {
            if (n <= 0.0f) {
                textView.setVisibility(8);
                ratingBar.setVisibility(8);
                return;
            }
            float rating = n;
            if (n > 5.0f) {
                rating = 5.0f;
            }
            textView.setText((CharSequence)String.format(Locale.getDefault(), "%1.1f", rating));
            textView.setVisibility(0);
            textView.setContentDescription((CharSequence)String.valueOf(String.valueOf(textView.getText())).concat(" stars"));
            textView.setTextColor(textColor);
            ratingBar.setRating(rating);
            ratingBar.setVisibility(0);
            ((LayerDrawable)ratingBar.getProgressDrawable()).getDrawable(2).setColorFilter(n2, PorterDuff$Mode.SRC_ATOP);
        }
    }
    
    public static void f(final TextView textView, final Spanned spanned) {
        if (textView != null) {
            tpe.t(textView, (CharSequence)spanned);
        }
    }
    
    public static void g(final ImageView imageView, final aotp aotp, final acgs acgs) {
        if (imageView != null && aotp != null) {
            acgs.g(imageView, aotp);
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(8);
    }
    
    public static boolean h(final boolean b) {
        return !b;
    }
    
    public static View i(final View view, final ViewGroup viewGroup, final String s, final String s2, final boolean b, final Context context, final int n) {
        final TextView bi = bi(view, viewGroup, context, n);
        final ViewGroup$LayoutParams layoutParams = bi.getLayoutParams();
        layoutParams.height = -2;
        bi.setLayoutParams(layoutParams);
        bi.setSingleLine(false);
        bj(bi, s, s2);
        bk(bi, b, false, context);
        return (View)bi;
    }
    
    public static View j(final View view, final ViewGroup viewGroup, final String s, final String s2, final boolean b, final boolean b2, final Context context, final int n) {
        final TextView bi = bi(view, viewGroup, context, n);
        bi.setSingleLine(false);
        bj(bi, s, s2);
        bk(bi, b, b2, context);
        return (View)bi;
    }
    
    public static CharSequence k(final Activity activity, int i) {
        final SpannableString spannableString = new SpannableString(activity.getText(i));
        final int length = spannableString.length();
        i = 0;
        for (Annotation[] array = (Annotation[])spannableString.getSpans(0, length, (Class)Annotation.class); i < array.length; ++i) {
            final Annotation annotation = array[i];
            if (annotation.getKey().equals("font") && annotation.getValue().equals("deeplink_emphasis")) {
                spannableString.setSpan((Object)new TextAppearanceSpan((Context)activity, 2132085306), spannableString.getSpanStart((Object)annotation), spannableString.getSpanEnd((Object)annotation), 33);
            }
        }
        return (CharSequence)spannableString;
    }
    
    public static List l(final ackm ackm, Object o, final List list, final acku acku, final tsu tsu, final SwipeLayout swipeLayout) {
        if (tsu != null) {
            tsu.a.add(swipeLayout);
        }
        swipeLayout.h();
        if (list != null && !list.isEmpty()) {
            final ackm ackm2 = new ackm(ackm);
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", o);
            ackm2.g(hashMap);
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = list.iterator();
            Object o2 = null;
            while (iterator.hasNext()) {
                final aicz aicz = (aicz)iterator.next();
                if (aicz != null) {
                    o = new krr(aicz);
                    final aezp a = aald.A(acku, o, (ViewGroup)null);
                    if (!a.h()) {
                        continue;
                    }
                    final acko acko = (acko)a.c();
                    acko.mN(ackm2, o);
                    list2.add(acko.a());
                    if ((o = o2) == null) {
                        o = new ArrayList();
                    }
                    ((List<acko>)o).add(acko);
                    o2 = o;
                }
            }
            tpe.Y(swipeLayout, (List)list2);
            return (List)o2;
        }
        swipeLayout.h = false;
        return null;
    }
    
    public static void m(final tsu tsu, final SwipeLayout swipeLayout, final List list, final acku acku) {
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final View a = ((acko)iterator.next()).a();
                if (a.getParent() != null) {
                    ((ViewGroup)a.getParent()).removeView(a);
                }
                acku.b(a);
            }
            list.clear();
        }
        if (tsu != null) {
            tsu.a.remove(swipeLayout);
        }
        tpe.Y(swipeLayout, (List)Collections.emptyList());
    }
    
    public static void n(final View view, final ImageView imageView, final boolean b) {
        int dimensionPixelSize;
        if (b) {
            dimensionPixelSize = 0;
        }
        else {
            dimensionPixelSize = view.getResources().getDimensionPixelSize(2131169798);
        }
        int dimensionPixelSize2;
        if (b) {
            dimensionPixelSize2 = 0;
        }
        else {
            dimensionPixelSize2 = view.getResources().getDimensionPixelSize(2131169797);
        }
        view.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, 0);
        ImageView$ScaleType scaleType;
        if (b) {
            scaleType = ImageView$ScaleType.CENTER_CROP;
        }
        else {
            scaleType = ImageView$ScaleType.FIT_CENTER;
        }
        imageView.setScaleType(scaleType);
    }
    
    public static anph[] o(final List list) {
        final anph[] array = new anph[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array[i] = (anph)list.get(i);
        }
        return array;
    }
    
    public static anpi[] p(final List list) {
        final anpi[] array = new anpi[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array[i] = (anpi)list.get(i);
        }
        return array;
    }
    
    public static int q(final Resources resources, final alxu alxu) {
        if (alxu == null) {
            return resources.getInteger(2131492890);
        }
        final int de = aqsx.dE(alxu.b);
        if (de != 0) {
            if (de == 7) {
                return resources.getInteger(2131492892);
            }
        }
        return resources.getInteger(2131492890);
    }
    
    public static void r(final Resources resources, final alxu alxu, final PlaylistThumbnailView playlistThumbnailView, final RelativeLayout relativeLayout, final TextView textView) {
        final ViewGroup$LayoutParams layoutParams = playlistThumbnailView.getLayoutParams();
        if (alxu == null) {
            return;
        }
        final int integer = resources.getInteger(2131492890);
        int de;
        if ((de = aqsx.dE(alxu.b)) == 0) {
            de = 2;
        }
        int n = de;
        if (playlistThumbnailView.getParent() instanceof LinearLayout) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)layoutParams;
            linearLayout$LayoutParams.weight = 0.0f;
            int n2 = 0;
            Label_0097: {
                if ((n2 = de) != 8) {
                    if ((n2 = de) != 9) {
                        break Label_0097;
                    }
                    n2 = 9;
                }
                linearLayout$LayoutParams.weight = 1.0f;
            }
            n = n2;
            if (relativeLayout != null) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams2 = (LinearLayout$LayoutParams)relativeLayout.getLayoutParams();
                linearLayout$LayoutParams2.weight = 0.0f;
                if ((n = n2) == 9) {
                    linearLayout$LayoutParams2.weight = 1.0f;
                    n = n2;
                }
            }
        }
        final int n3 = n - 1;
        int integer2;
        if (n3 != 5) {
            if (n3 != 6) {
                if (n3 != 7) {
                    if (n3 != 8) {
                        layoutParams.width = (int)resources.getDimension(2131167259);
                        playlistThumbnailView.c(2131167012);
                        integer2 = integer;
                    }
                    else {
                        if (relativeLayout != null) {
                            relativeLayout.getLayoutParams().width = -1;
                            layoutParams.width = -1;
                        }
                        playlistThumbnailView.c(2131167012);
                        integer2 = integer;
                    }
                }
                else {
                    if (relativeLayout != null) {
                        relativeLayout.getLayoutParams().width = (int)resources.getDimension(2131167255);
                    }
                    playlistThumbnailView.c(2131167012);
                    integer2 = integer;
                }
            }
            else {
                integer2 = resources.getInteger(2131492892);
                layoutParams.width = (int)resources.getDimension(2131167254);
                playlistThumbnailView.c(2131167901);
            }
        }
        else {
            layoutParams.width = (int)resources.getDimension(2131167253);
            playlistThumbnailView.c(2131167012);
            integer2 = integer;
        }
        textView.setMaxLines(integer2);
    }
    
    public static void s(final Resources resources, final alxu alxu, final LinearLayout$LayoutParams linearLayout$LayoutParams, final LinearLayout$LayoutParams linearLayout$LayoutParams2) {
        if (alxu == null) {
            linearLayout$LayoutParams.weight = 0.0f;
            linearLayout$LayoutParams.width = (int)resources.getDimension(2131167259);
            linearLayout$LayoutParams2.weight = 1.0f;
            return;
        }
        int de;
        if ((de = aqsx.dE(alxu.b)) == 0) {
            de = 2;
        }
        if (--de == 5) {
            linearLayout$LayoutParams.weight = 0.0f;
            linearLayout$LayoutParams.width = (int)resources.getDimension(2131167253);
            linearLayout$LayoutParams2.weight = 1.0f;
            return;
        }
        if (de == 6) {
            linearLayout$LayoutParams.weight = 0.0f;
            linearLayout$LayoutParams.width = (int)resources.getDimension(2131167254);
            linearLayout$LayoutParams2.weight = 1.0f;
            return;
        }
        if (de == 7) {
            linearLayout$LayoutParams.weight = 1.0f;
            linearLayout$LayoutParams2.weight = 0.0f;
            linearLayout$LayoutParams2.width = (int)resources.getDimension(2131167255);
            return;
        }
        if (de != 8) {
            linearLayout$LayoutParams.weight = 0.0f;
            linearLayout$LayoutParams.width = (int)resources.getDimension(2131167259);
            linearLayout$LayoutParams2.weight = 1.0f;
            return;
        }
        linearLayout$LayoutParams.width = -1;
        linearLayout$LayoutParams.weight = 1.0f;
        linearLayout$LayoutParams2.weight = 1.0f;
    }
    
    public static boolean t(final alxu alxu) {
        if (alxu != null) {
            final int de = aqsx.dE(alxu.b);
            if (de != 0) {
                if (de == 10) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static aezp u(final Context context, final alxr alxr, int az, final int n) {
        alxq alxq;
        if ((alxq = alxr.d) == null) {
            alxq = alxq.a;
        }
        final int df = aqsx.dF(alxr.c);
        if (df != 0) {
            if (df == 4) {
                final float c = alxq.c;
                if (c > 0.0f && c < 1.0f) {
                    alxq alxq2;
                    if ((alxq2 = alxr.d) == null) {
                        alxq2 = alxq.a;
                    }
                    int bc = 0;
                    Label_0118: {
                        if ((alxq2.b & 0x2) != 0x0) {
                            final float d = alxq2.d;
                            if (d > 0.0f) {
                                bc = (int)d;
                                break Label_0118;
                            }
                        }
                        bc = tpe.bc(context);
                    }
                    final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    final int az2 = tpe.aZ(displayMetrics, tpe.bc(context));
                    final float c2 = alxq2.c;
                    final float n2 = (float)(az2 - az - n);
                    az = tpe.aZ(displayMetrics, bc);
                    return aezp.k((Object)Math.min((int)(n2 * c2), az));
                }
            }
        }
        return (aezp)aeyo.a;
    }
    
    public static final Class[] v(final kbi kbi, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { hyu.class };
        }
        if (n == 0) {
            kbi.o((hyu)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static int w(final Context context) {
        if (tpe.bq(context)) {
            return context.getResources().getInteger(2131492957);
        }
        return context.getResources().getInteger(2131492955);
    }
    
    public static CharSequence x(final Context context, final oby oby, final apfs apfs) {
        if (apfs == null) {
            return "";
        }
        ajut ajut;
        if ((ajut = apfs.c) == null) {
            ajut = ajut.a;
        }
        final Spanned b = acak.b(ajut);
        if (!TextUtils.isEmpty((CharSequence)b)) {
            return (CharSequence)b;
        }
        if (apfs.b * 1000L < oby.c()) {
            return "";
        }
        return context.getString(2132018387, new Object[] { DateFormat.format((CharSequence)DateFormat.getBestDateTimePattern(Locale.getDefault(), "M d yy h mm a"), apfs.b * 1000L) });
    }
    
    public static void y(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static void z(final jti jti, final tgd tgd) {
        jti.getClass();
        tgd.getClass();
        jti.h(jto.a(tgd));
        jti.g(jtm.a(tgd));
        jti.f(jtk.a(tgd));
    }
}
