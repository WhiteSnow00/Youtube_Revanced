import android.view.View;
import android.os.Build$VERSION;
import android.content.ClipData;
import android.content.ClipData$Item;
import android.util.Log;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ape extends InputConnectionWrapper
{
    final oqz a;
    
    public ape(final InputConnection inputConnection, final oqz a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        super(inputConnection, false);
    }
    
    public final boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
        final oqz a = this.a;
        avv avv = null;
        if (inputContentInfo != null) {
            avv = new avv(new avv((Object)inputContentInfo), (byte[])null, (byte[])null, (byte[])null);
        }
        final Object a2 = a.a;
        Bundle bundle2 = null;
        Label_0135: {
            if ((n & 0x1) != 0x0) {
                try {
                    ((InputContentInfo)((avv)avv.a).a).requestPermission();
                    final Object a3 = ((avv)avv.a).a;
                    if (bundle == null) {
                        bundle2 = new Bundle();
                    }
                    else {
                        bundle2 = new Bundle(bundle);
                    }
                    bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", (Parcelable)a3);
                    break Label_0135;
                }
                catch (final Exception ex) {
                    Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", (Throwable)ex);
                    return super.commitContent(inputContentInfo, n, bundle);
                }
            }
            bundle2 = bundle;
        }
        final ClipData clipData = new ClipData(((InputContentInfo)((avv)avv.a).a).getDescription(), new ClipData$Item(((InputContentInfo)((avv)avv.a).a).getContentUri()));
        Object o;
        if (Build$VERSION.SDK_INT >= 31) {
            o = new akz(clipData, 2);
        }
        else {
            o = new alb(clipData, 2);
        }
        ((ala)o).d(((InputContentInfo)((avv)avv.a).a).getLinkUri());
        ((ala)o).b(bundle2);
        if (anc.r((View)a2, afh.d((ala)o)) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, n, bundle);
    }
}
