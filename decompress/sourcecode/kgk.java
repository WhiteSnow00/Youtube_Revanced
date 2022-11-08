import com.google.protos.youtube.api.innertube.SettingRenderer;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.protos.youtube.api.innertube.ChannelListSubMenuRendererOuterClass;
import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;
import android.util.DisplayMetrics;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.text.format.DateFormat;
import java.util.Date;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.os.Looper;
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
import android.os.Handler;
import java.util.concurrent.Callable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class kgk
{
    public kgk() {
    }
    
    public kgk(final mrm mrm, final Context context, final alm alm, final zki zki, final gbn gbn, final asho asho, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        if (uyi.ao()) {
            mrm.A((Callable)new ihm(context, alm, zki, gbn, asho, 3, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public static boolean A(final uyi uyi, final uyi uyi2) {
        return uyi.be() && !uyi2.bG();
    }
    
    public static boolean B(final uyi uyi, final uyi uyi2, final jpb jpb) {
        if (!A(uyi, uyi2)) {
            return false;
        }
        final jpb a = jpb.a;
        final int ordinal = jpb.ordinal();
        return ordinal == 1 || (ordinal != 2 && uyi.f(45362265L));
    }
    
    public static boolean C(final uyi uyi, final uyi uyi2, final jpc jpc) {
        jpb jpb;
        if ((jpb = jpb.a(jpc.l)) == null) {
            jpb = jpb.a;
        }
        return B(uyi, uyi2, jpb);
    }
    
    public static String D(final Context context, final jpc jpc) {
        final long r = jpc.r;
        String s;
        if (jpc.u) {
            s = context.getString(2132017816, new Object[] { String.valueOf(tmy.U(r)) });
        }
        else {
            s = context.getString(2132017817, new Object[] { String.valueOf(tmy.V(r)) });
        }
        return s;
    }
    
    public static void E(final Handler handler, final Context context, final String s, final boolean b) {
        handler.post((Runnable)new hrw(context, s, b, 3));
    }
    
    public static ArrayList F() {
        return new ArrayList();
    }
    
    public static boolean G(final int[] array, final int n) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static void H(final SafeParcelable safeParcelable, final Intent intent) {
        final Parcel obtain = Parcel.obtain();
        mtw.b((InProductHelp)safeParcelable, obtain, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("EXTRA_IN_PRODUCT_HELP", marshall);
    }
    
    public static int I(final Parcel parcel) {
        return bq(parcel, 20293);
    }
    
    public static void J(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(n - 4);
        parcel.writeInt(dataPosition - n);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void K(final Parcel parcel, final int n, final boolean b) {
        N(parcel, n, 4);
        parcel.writeInt((int)(b ? 1 : 0));
    }
    
    public static void L(final Parcel parcel, final int n, final double n2) {
        N(parcel, n, 8);
        parcel.writeDouble(n2);
    }
    
    public static void M(final Parcel parcel, final int n, final float n2) {
        N(parcel, n, 4);
        parcel.writeFloat(n2);
    }
    
    public static void N(final Parcel parcel, final int n, final int n2) {
        parcel.writeInt(n | n2 << 16);
    }
    
    public static void O(final Parcel parcel, final int n, final int n2) {
        N(parcel, n, 4);
        parcel.writeInt(n2);
    }
    
    public static void P(final Parcel parcel, final int n, final long n2) {
        N(parcel, n, 8);
        parcel.writeLong(n2);
    }
    
    public static void Q(final Parcel parcel, final int n, final Boolean b) {
        if (b == null) {
            return;
        }
        N(parcel, n, 4);
        parcel.writeInt((int)(((boolean)b) ? 1 : 0));
    }
    
    public static void R(final Parcel parcel, int bq, final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcel.writeBundle(bundle);
        J(parcel, bq);
    }
    
    public static void S(final Parcel parcel, int bq, final byte[] array) {
        if (array == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcel.writeByteArray(array);
        J(parcel, bq);
    }
    
    public static void T(final Parcel parcel, int i, final byte[][] array) {
        if (array == null) {
            return;
        }
        final int bq = bq(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        for (i = 0; i < length; ++i) {
            parcel.writeByteArray(array[i]);
        }
        J(parcel, bq);
    }
    
    public static void U(final Parcel parcel, int bq, final IBinder binder) {
        if (binder == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcel.writeStrongBinder(binder);
        J(parcel, bq);
    }
    
    public static void V(final Parcel parcel, int bq, final int[] array) {
        if (array == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcel.writeIntArray(array);
        J(parcel, bq);
    }
    
    public static void W(final Parcel parcel, int i, final List list) {
        if (list == null) {
            return;
        }
        final int bq = bq(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            parcel.writeInt((int)list.get(i));
        }
        J(parcel, bq);
    }
    
    public static void X(final Parcel parcel, final int n, final Integer n2) {
        if (n2 == null) {
            return;
        }
        N(parcel, n, 4);
        parcel.writeInt((int)n2);
    }
    
    public static void Y(final Parcel parcel, int bq, final long[] array) {
        if (array == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcel.writeLongArray(array);
        J(parcel, bq);
    }
    
    public static void Z(final Parcel parcel, int i, final List list) {
        if (list == null) {
            return;
        }
        final int bq = bq(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            parcel.writeLong((long)list.get(i));
        }
        J(parcel, bq);
    }
    
    public static int a(final List list, final int n) {
        for (int i = 0; i < list.size(); ++i) {
            int q;
            if ((q = alhb.q(list.get(i).c)) == 0) {
                q = 1;
            }
            if (q == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static void aA(final Parcel parcel, final int n) {
        if (parcel.dataPosition() == n) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Overread allowed size end=");
        sb.append(n);
        throw new mtz(sb.toString(), parcel);
    }
    
    public static void aB(final Parcel parcel, int am) {
        am = am(parcel, am);
        parcel.setDataPosition(parcel.dataPosition() + am);
    }
    
    public static boolean aC(final Parcel parcel, final int n) {
        bs(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    public static byte[] aD(final Parcel parcel, int am) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + am);
        return byteArray;
    }
    
    public static int[] aE(final Parcel parcel, int am) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + am);
        return intArray;
    }
    
    public static long[] aF(final Parcel parcel, int am) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final long[] longArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + am);
        return longArray;
    }
    
    public static Object[] aG(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int am = am(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray(parcelable$Creator);
        parcel.setDataPosition(dataPosition + am);
        return typedArray;
    }
    
    public static String[] aH(final Parcel parcel, int am) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + am);
        return stringArray;
    }
    
    public static byte[][] aI(final Parcel parcel, int i) {
        final int am = am(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final byte[][] array = new byte[int1][];
        for (i = 0; i < int1; ++i) {
            array[i] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + am);
        return array;
    }
    
    public static void aJ(final Parcel parcel, final int n, final int n2) {
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
        throw new mtz(sb.toString(), parcel);
    }
    
    public static String aK(final String s, final Resources resources, final String s2) {
        final int identifier = resources.getIdentifier(s, "string", s2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
    
    public static Object aL(final Object o) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException("null reference");
    }
    
    public static void aM(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void aN(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static void aO(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(s, array));
    }
    
    public static void aP(final Handler handler) {
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
    
    public static void aQ(final String s) {
        if (meo.E()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void aR() {
        aS("Must not be called on the main application thread");
    }
    
    public static void aS(final String s) {
        if (!meo.E()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void aT(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void aU(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException((String)o);
    }
    
    public static void aV(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
    
    public static void aW(final String s, final Object o) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException((String)o);
    }
    
    public static void aX(final Object o, final Object o2) {
        if (o != null) {
            return;
        }
        throw new NullPointerException((String)o2);
    }
    
    public static nly aY(final mpy mpy, final mtu mtu) {
        final nmo nmo = new nmo();
        mpy.e((mpx)new mtt(mpy, nmo, mtu, (byte[])null));
        return (nly)nmo.a;
    }
    
    public static void aZ(final mpy mpy) {
        aY(mpy, (mtu)new nng(1));
    }
    
    public static void aa(final Parcel parcel, final int n, final Long n2) {
        if (n2 == null) {
            return;
        }
        N(parcel, n, 8);
        parcel.writeLong((long)n2);
    }
    
    public static void ab(final Parcel parcel, int bq, final Parcelable parcelable, final int n) {
        if (parcelable == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcelable.writeToParcel(parcel, n);
        J(parcel, bq);
    }
    
    public static void ac(final Parcel parcel, int bq, final String s) {
        if (s == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcel.writeString(s);
        J(parcel, bq);
    }
    
    public static void ad(final Parcel parcel, int bq, final String[] array) {
        if (array == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcel.writeStringArray(array);
        J(parcel, bq);
    }
    
    public static void ae(final Parcel parcel, int bq, final List list) {
        if (list == null) {
            return;
        }
        bq = bq(parcel, bq);
        parcel.writeStringList(list);
        J(parcel, bq);
    }
    
    public static void af(final Parcel parcel, int i, final Parcelable[] array, final int n) {
        if (array == null) {
            return;
        }
        final int bq = bq(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcelable parcelable;
        for (i = 0; i < length; ++i) {
            parcelable = array[i];
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                br(parcel, parcelable, n);
            }
        }
        J(parcel, bq);
    }
    
    public static void ag(final Parcel parcel, int i, final List list) {
        if (list == null) {
            return;
        }
        final int bq = bq(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        for (i = 0; i < size; ++i) {
            parcelable = list.get(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                br(parcel, parcelable, 0);
            }
        }
        J(parcel, bq);
    }
    
    public static double ah(final Parcel parcel, final int n) {
        bs(parcel, n, 8);
        return parcel.readDouble();
    }
    
    public static float ai(final Parcel parcel, final int n) {
        bs(parcel, n, 4);
        return parcel.readFloat();
    }
    
    public static int aj(final int n) {
        return (char)n;
    }
    
    public static int ak(final Parcel parcel) {
        return parcel.readInt();
    }
    
    public static int al(final Parcel parcel, final int n) {
        bs(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static int am(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return (char)(n >> 16);
        }
        return parcel.readInt();
    }
    
    public static int an(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final int am = am(parcel, int1);
        final int dataPosition = parcel.dataPosition();
        if (aj(int1) != 20293) {
            throw new mtz("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(int1))), parcel);
        }
        final int n = am + dataPosition;
        if (n >= dataPosition && n <= parcel.dataSize()) {
            return n;
        }
        final StringBuilder sb = new StringBuilder("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(n);
        throw new mtz(sb.toString(), parcel);
    }
    
    public static long ao(final Parcel parcel, final int n) {
        bs(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static Bundle ap(final Parcel parcel, int am) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + am);
        return bundle;
    }
    
    public static IBinder aq(final Parcel parcel, int am) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + am);
        return strongBinder;
    }
    
    public static Parcelable ar(final Parcel parcel, int am, final Parcelable$Creator parcelable$Creator) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + am);
        return parcelable;
    }
    
    public static Boolean as(final Parcel parcel, int am) {
        am = am(parcel, am);
        if (am == 0) {
            return null;
        }
        aJ(parcel, am, 4);
        return parcel.readInt() != 0;
    }
    
    public static Integer at(final Parcel parcel, int am) {
        am = am(parcel, am);
        if (am == 0) {
            return null;
        }
        aJ(parcel, am, 4);
        return parcel.readInt();
    }
    
    public static Long au(final Parcel parcel, int am) {
        am = am(parcel, am);
        if (am == 0) {
            return null;
        }
        aJ(parcel, am, 8);
        return parcel.readLong();
    }
    
    public static String av(final Parcel parcel, int am) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(dataPosition + am);
        return string;
    }
    
    public static ArrayList aw(final Parcel parcel, int i) {
        final int am = am(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final ArrayList list = new ArrayList();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + am);
        return list;
    }
    
    public static ArrayList ax(final Parcel parcel, int i) {
        final int am = am(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final ArrayList list = new ArrayList();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + am);
        return list;
    }
    
    public static ArrayList ay(final Parcel parcel, int am) {
        am = am(parcel, am);
        final int dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + am);
        return stringArrayList;
    }
    
    public static ArrayList az(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int am = am(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (am == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList(parcelable$Creator);
        parcel.setDataPosition(dataPosition + am);
        return typedArrayList;
    }
    
    public static String b(final List list, final int n) {
        for (final ajsx ajsx : list) {
            int q;
            if ((q = alhb.q(ajsx.c)) == 0) {
                q = 1;
            }
            if (q == n) {
                return ajsx.d;
            }
        }
        return null;
    }
    
    public static boolean ba(final Object o, final Object o2) {
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
    
    public static String bb(final List list, final Object o) {
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
    
    public static void bc(final String s, final Object o, final List list) {
        final String value = String.valueOf(o);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("=");
        sb.append(value);
        list.add(sb.toString());
    }
    
    public static mpn bd(final Status status) {
        if (status.i != null) {
            return (mpn)new mqa(status);
        }
        return new mpn(status);
    }
    
    public static mrp be(final Object o, final String s) {
        aX(o, "Listener must not be null");
        aX(s, "Listener type must not be null");
        aW(s, "Listener type must not be empty");
        return new mrp(o, s);
    }
    
    public static mrr bf(final Object o, final Looper looper, final String s) {
        aX(o, "Listener must not be null");
        aX(looper, "Looper must not be null");
        aX(s, "Listener type must not be null");
        return new mrr(looper, o, s);
    }
    
    public static void bg(final Status status, final nmo nmo) {
        bh(status, null, nmo);
    }
    
    public static void bh(final Status status, final Object o, final nmo nmo) {
        if (status.c()) {
            nmo.c(o);
            return;
        }
        nmo.b((Exception)bd(status));
    }
    
    public static boolean bi(final Status status, final Object o, final nmo nmo) {
        if (status.c()) {
            return nmo.e(o);
        }
        return nmo.d((Exception)bd(status));
    }
    
    public static int bl(final int n) {
        for (int i = 0; i < 6; ++i) {
            final int n2 = (new int[] { 1, 2, 3, 4, 5, 6 })[i];
            if (n2 == 0) {
                throw null;
            }
            if (n2 - 1 == n) {
                return n2;
            }
        }
        return 1;
    }
    
    public static fzw bm(final Activity activity, final hdv hdv, final hzz hzz, final fze fze, final uyf uyf, final atjj atjj, final WatchOnTvMenuItem watchOnTvMenuItem, final uyi uyi, final uyi uyi2) {
        final afds i = afdu.i();
        if (uyi2.f(45364497L)) {
            i.h(hzz);
            i.h(fze);
            i.h(hdv.i());
        }
        else {
            i.h(hzz);
            i.h(fze);
            i.h(watchOnTvMenuItem);
            i.h(hdv.i());
        }
        amga amga;
        if ((amga = uyf.b().i) == null) {
            amga = amga.a;
        }
        ajtt ajtt;
        if ((ajtt = amga.o) == null) {
            ajtt = ajtt.a;
        }
        if (ajtt.b) {
            i.h(atjj.a());
        }
        final too a = fzb.a();
        a.f = activity.getString(2132017506);
        a.f(i.g());
        a.c(ezp.t(2130970864));
        final fzb b = a.b();
        final fzv a2 = fzw.a();
        a2.b(b);
        a2.c(ezp.t(2130970845));
        a2.k(ezp.t(2130970910));
        int n;
        if (!(boolean)uyi.l(45356896L).aG()) {
            n = 2132084523;
        }
        else {
            n = 2132084524;
        }
        a2.h(n);
        a2.g(ezp.t(2130970924));
        a2.j(2132084522);
        a2.i(ezp.t(2130970926));
        return a2.a();
    }
    
    public static bx bn(final uyf uyf) {
        final ains b = uyf.b();
        if (b != null) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            if (alvl.aP) {
                return new bx(VoiceSearchActivityV2.class);
            }
        }
        return new bx(VoiceSearchActivity.class);
    }
    
    private static String bo(final Context context, final Date date) {
        String s;
        if (!DateFormat.is24HourFormat(context)) {
            s = "h:mm a";
        }
        else {
            s = "HH:mm";
        }
        return new SimpleDateFormat(s, Locale.getDefault()).format(date);
    }
    
    private static Date bp(final ajah ajah) {
        if (ajah == null) {
            return new Date(0, 0, 0, 0, 0);
        }
        return new Date(0, 0, 0, ajah.c, ajah.d);
    }
    
    private static int bq(final Parcel parcel, final int n) {
        parcel.writeInt(n | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    private static void br(final Parcel parcel, final Parcelable parcelable, int dataPosition) {
        final int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(1);
        final int dataPosition3 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        parcel.setDataPosition(dataPosition2);
        parcel.writeInt(dataPosition - dataPosition3);
        parcel.setDataPosition(dataPosition);
    }
    
    private static void bs(final Parcel parcel, int am, final int n) {
        am = am(parcel, am);
        if (am == n) {
            return;
        }
        final String hexString = Integer.toHexString(am);
        final StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(n);
        sb.append(" got ");
        sb.append(am);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new mtz(sb.toString(), parcel);
    }
    
    public static String c(final List list, final List list2, final int n) {
        final String b = b(list2, n);
        if (b != null) {
            for (final ajtb ajtb : list) {
                if (b.equals(ajtb.e)) {
                    ajtc a;
                    if (ajtb.c == 4) {
                        a = (ajtc)ajtb.d;
                    }
                    else {
                        a = ajtc.a;
                    }
                    return a.c;
                }
            }
        }
        return null;
    }
    
    public static int d(final Resources resources, final alvq alvq) {
        if (alvq == null) {
            return resources.getInteger(2131492890);
        }
        final int dd = aqql.dD(alvq.b);
        if (dd != 0) {
            if (dd == 7) {
                return resources.getInteger(2131492892);
            }
        }
        return resources.getInteger(2131492890);
    }
    
    public static void e(final Resources resources, final alvq alvq, final PlaylistThumbnailView playlistThumbnailView, final RelativeLayout relativeLayout, final TextView textView) {
        final ViewGroup$LayoutParams layoutParams = playlistThumbnailView.getLayoutParams();
        if (alvq == null) {
            return;
        }
        final int integer = resources.getInteger(2131492890);
        int dd;
        if ((dd = aqql.dD(alvq.b)) == 0) {
            dd = 2;
        }
        int n = dd;
        if (playlistThumbnailView.getParent() instanceof LinearLayout) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)layoutParams;
            linearLayout$LayoutParams.weight = 0.0f;
            int n2 = 0;
            Label_0097: {
                if ((n2 = dd) != 8) {
                    if ((n2 = dd) != 9) {
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
                        layoutParams.width = (int)resources.getDimension(2131167260);
                        playlistThumbnailView.c(2131167013);
                        integer2 = integer;
                    }
                    else {
                        if (relativeLayout != null) {
                            relativeLayout.getLayoutParams().width = -1;
                            layoutParams.width = -1;
                        }
                        playlistThumbnailView.c(2131167013);
                        integer2 = integer;
                    }
                }
                else {
                    if (relativeLayout != null) {
                        relativeLayout.getLayoutParams().width = (int)resources.getDimension(2131167256);
                    }
                    playlistThumbnailView.c(2131167013);
                    integer2 = integer;
                }
            }
            else {
                integer2 = resources.getInteger(2131492892);
                layoutParams.width = (int)resources.getDimension(2131167255);
                playlistThumbnailView.c(2131167902);
            }
        }
        else {
            layoutParams.width = (int)resources.getDimension(2131167254);
            playlistThumbnailView.c(2131167013);
            integer2 = integer;
        }
        textView.setMaxLines(integer2);
    }
    
    public static void f(final Resources resources, final alvq alvq, final LinearLayout$LayoutParams linearLayout$LayoutParams, final LinearLayout$LayoutParams linearLayout$LayoutParams2) {
        if (alvq == null) {
            linearLayout$LayoutParams.weight = 0.0f;
            linearLayout$LayoutParams.width = (int)resources.getDimension(2131167260);
            linearLayout$LayoutParams2.weight = 1.0f;
            return;
        }
        int dd;
        if ((dd = aqql.dD(alvq.b)) == 0) {
            dd = 2;
        }
        if (--dd == 5) {
            linearLayout$LayoutParams.weight = 0.0f;
            linearLayout$LayoutParams.width = (int)resources.getDimension(2131167254);
            linearLayout$LayoutParams2.weight = 1.0f;
            return;
        }
        if (dd == 6) {
            linearLayout$LayoutParams.weight = 0.0f;
            linearLayout$LayoutParams.width = (int)resources.getDimension(2131167255);
            linearLayout$LayoutParams2.weight = 1.0f;
            return;
        }
        if (dd == 7) {
            linearLayout$LayoutParams.weight = 1.0f;
            linearLayout$LayoutParams2.weight = 0.0f;
            linearLayout$LayoutParams2.width = (int)resources.getDimension(2131167256);
            return;
        }
        if (dd != 8) {
            linearLayout$LayoutParams.weight = 0.0f;
            linearLayout$LayoutParams.width = (int)resources.getDimension(2131167260);
            linearLayout$LayoutParams2.weight = 1.0f;
            return;
        }
        linearLayout$LayoutParams.width = -1;
        linearLayout$LayoutParams.weight = 1.0f;
        linearLayout$LayoutParams2.weight = 1.0f;
    }
    
    public static boolean g(final alvq alvq) {
        if (alvq != null) {
            final int dd = aqql.dD(alvq.b);
            if (dd != 0) {
                if (dd == 10) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static aexq h(final Context context, final alvn alvn, final int n, final int n2) {
        alvm alvm;
        if ((alvm = alvn.d) == null) {
            alvm = alvm.a;
        }
        final int de = aqql.dE(alvn.c);
        if (de != 0) {
            if (de == 4) {
                final float c = alvm.c;
                if (c > 0.0f && c < 1.0f) {
                    alvm alvm2;
                    if ((alvm2 = alvn.d) == null) {
                        alvm2 = alvm.a;
                    }
                    int bc = 0;
                    Label_0118: {
                        if ((alvm2.b & 0x2) != 0x0) {
                            final float d = alvm2.d;
                            if (d > 0.0f) {
                                bc = (int)d;
                                break Label_0118;
                            }
                        }
                        bc = tmy.bc(context);
                    }
                    final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    return aexq.k((Object)Math.min((int)((tmy.aZ(displayMetrics, tmy.bc(context)) - n - n2) * alvm2.c), tmy.aZ(displayMetrics, bc)));
                }
            }
        }
        return aewp.a;
    }
    
    public static Class[] i(final kah kah, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { hxz.class };
        }
        if (n == 0) {
            kah.o((hxz)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static int j(final Context context) {
        if (tmy.bq(context)) {
            return context.getResources().getInteger(2131492957);
        }
        return context.getResources().getInteger(2131492955);
    }
    
    public static aige k(final veu veu) {
        return (aige)Optional.ofNullable((Object)veu).filter((Predicate)ifl.s).map((Function)jxm.g).orElse((Object)null);
    }
    
    public static boolean l(final veu veu) {
        if (veu != null) {
            anwr anwr;
            if ((anwr = veu.a.g) == null) {
                anwr = anwr.a;
            }
            amnw a;
            if (anwr.b == 256220752) {
                a = (amnw)anwr.c;
            }
            else {
                a = amnw.a;
            }
            anss anss;
            if ((anss = a.c) == null) {
                anss = anss.a;
            }
            if (((agzd)anss).rs((agyr)ChannelListSubMenuRendererOuterClass.channelListSubMenuRenderer)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean m(final veu veu) {
        if (veu != null) {
            anwr anwr;
            if ((anwr = veu.a.g) == null) {
                anwr = anwr.a;
            }
            amnw a;
            if (anwr.b == 256220752) {
                a = (amnw)anwr.c;
            }
            else {
                a = amnw.a;
            }
            if (a.e.size() > 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean n(final veu veu) {
        if (veu != null) {
            anwr anwr;
            if ((anwr = veu.a.g) == null) {
                anwr = anwr.a;
            }
            amnw a;
            if (anwr.b == 256220752) {
                a = (amnw)anwr.c;
            }
            else {
                a = amnw.a;
            }
            if (!a.f.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    public static int o(final List list) {
        for (int i = 0; i < list.size(); ++i) {
            if (((anxz)list.get(i)).d) {
                return i;
            }
        }
        return 0;
    }
    
    public static TextView p(final Context context, final anyf anyf) {
        final YouTubeTextView youTubeTextView = new YouTubeTextView(context);
        ajsq ajsq;
        if ((anyf.b & 0x2) != 0x0) {
            if ((ajsq = anyf.d) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        ((TextView)youTubeTextView).setText((CharSequence)abyh.b(ajsq));
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ((TextView)youTubeTextView).setPadding(tmy.aZ(displayMetrics, 20), tmy.aZ(displayMetrics, 18), tmy.aZ(displayMetrics, 20), tmy.aZ(displayMetrics, 8));
        ((TextView)youTubeTextView).setTextSize(0, context.getResources().getDimension(2131166447));
        ((TextView)youTubeTextView).setTypeface(abyk.g.a(context));
        ((TextView)youTubeTextView).setTextColor(tmy.cp(context, 16842806));
        return (TextView)youTubeTextView;
    }
    
    public static String q(final Context context, final List list, final int n) {
        ajah ajah;
        if ((ajah = list.get(n).c) == null) {
            ajah = ajah.a;
        }
        return bo(context, bp(ajah));
    }
    
    public static String r(final Context context, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            final anxz anxz = list.get(i);
            if (anxz.d) {
                ajah ajah;
                if ((ajah = anxz.c) == null) {
                    ajah = ajah.a;
                }
                return bo(context, bp(ajah));
            }
        }
        ajah ajah2;
        if ((ajah2 = list.get(0).c) == null) {
            ajah2 = ajah.a;
        }
        return bo(context, bp(ajah2));
    }
    
    public static List s(final anyf anyf) {
        final ArrayList list = new ArrayList();
        for (final anyb anyb : anyf.f) {
            if (anyb.b == 190692730) {
                list.add(anyb.c);
            }
        }
        return list;
    }
    
    public static List t(final Context context, final List list) {
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ajah ajah;
            if ((ajah = ((anxz)iterator.next()).c) == null) {
                ajah = ajah.a;
            }
            list2.add(bo(context, bp(ajah)));
        }
        return list2;
    }
    
    public static List u(final anxy anxy) {
        final ArrayList list = new ArrayList();
        for (final anss anss : anxy.d) {
            if (((agzd)anss).rs((agyr)SettingRenderer.settingSingleOptionMenuRenderer)) {
                list.add(((agzd)anss).rr((agyr)SettingRenderer.settingSingleOptionMenuRenderer));
            }
        }
        return list;
    }
    
    public static List v(final anxy anxy, final int n) {
        final List u = u(anxy);
        Object f;
        if (u.size() == 2) {
            f = u.get(n).f;
        }
        else {
            f = new ArrayList();
        }
        return (List)f;
    }
    
    public static anxy w(final anxy anxy, int n, int n2) {
        final List u = u(anxy);
        anxy anxy2 = anxy;
        if (u.size() == 2) {
            final anyf anyf = u.get(n);
            final agzy f = anyf.f;
            final ArrayList list = new ArrayList();
            final int n3 = 0;
            for (int i = 0; i < ((List)f).size(); ++i) {
                final anyb anyb = (anyb)((List)f).get(i);
                final agza builder = ((agzi)anyb).toBuilder();
                anxz a;
                if (anyb.b == 190692730) {
                    a = (anxz)anyb.c;
                }
                else {
                    a = anxz.a;
                }
                final agza builder2 = ((agzi)a).toBuilder();
                final boolean d = i == n2 % ((List)f).size();
                builder2.copyOnWrite();
                final anxz anxz = (anxz)builder2.instance;
                anxz.b |= 0x4;
                anxz.d = d;
                builder.copyOnWrite();
                final anyb anyb2 = (anyb)builder.instance;
                final anxz c = (anxz)builder2.build();
                c.getClass();
                anyb2.c = c;
                anyb2.b = 190692730;
                list.add(builder.build());
            }
            final agza builder3 = ((agzi)anyf).toBuilder();
            builder3.copyOnWrite();
            ((anyf)builder3.instance).f = anyf.emptyProtobufList();
            builder3.copyOnWrite();
            final anyf anyf2 = (anyf)builder3.instance;
            anyf2.a();
            agxl.addAll((Iterable)list, (List)anyf2.f);
            u.set(n, builder3.build());
            final agza builder4 = ((agzi)anxy).toBuilder();
            n2 = 0;
            for (int n4 = n3; n4 < anxy.d.size() && n2 < u.size(); ++n4, n2 = n) {
                n = n2;
                if (((agzd)anxy.d.get(n4)).rs((agyr)SettingRenderer.settingSingleOptionMenuRenderer)) {
                    final agzc agzc = (agzc)((agzi)anss.a).createBuilder();
                    agzc.e((agyr)SettingRenderer.settingSingleOptionMenuRenderer, (Object)u.get(n2));
                    builder4.copyOnWrite();
                    final anxy anxy3 = (anxy)builder4.instance;
                    final anss anss = (anss)((agza)agzc).build();
                    anss.getClass();
                    anxy3.a();
                    anxy3.d.set(n4, (Object)anss);
                    n = n2 + 1;
                }
            }
            anxy2 = (anxy)builder4.build();
        }
        return anxy2;
    }
    
    public static jpc y(final jpc jpc, final boolean b) {
        final agza builder = jpc.toBuilder();
        jpb jpb;
        if (b) {
            jpb = jpb.b;
        }
        else {
            jpb = jpb.c;
        }
        builder.copyOnWrite();
        final jpc jpc2 = (jpc)builder.instance;
        jpc2.l = jpb.d;
        jpc2.b |= 0x800;
        return (jpc)builder.build();
    }
    
    public static aply z(final aqnz aqnz, final thh thh) {
        aply aply;
        if (thh.r()) {
            if ((aply = aply.b(aqnz.j)) == null) {
                aply = aply.a;
            }
        }
        else if ((aply = aply.b(aqnz.i)) == null) {
            aply = aply.a;
        }
        return aply;
    }
    
    @Deprecated
    public mpm bj(final Context context, final Looper looper, final msx msx, final Object o, final mpt mpt, final mpu mpu) {
        return this.bk(context, looper, msx, o, (mqx)mpt, (mrv)mpu);
    }
    
    public mpm bk(final Context context, final Looper looper, final msx msx, final Object o, final mqx mqx, final mrv mrv) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
