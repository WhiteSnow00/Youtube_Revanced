import android.content.Context;
import android.widget.Toast;
import android.os.Build$VERSION;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.MenuItem;
import android.text.TextUtils;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ContextMenu;
import androidx.preference.Preference;
import android.view.MenuItem$OnMenuItemClickListener;
import android.view.View$OnCreateContextMenuListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cer implements View$OnCreateContextMenuListener, MenuItem$OnMenuItemClickListener
{
    private final Preference a;
    
    public cer(final Preference a) {
        this.a = a;
    }
    
    public final void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        final CharSequence m = this.a.m();
        if (this.a.A) {
            if (!TextUtils.isEmpty(m)) {
                contextMenu.setHeaderTitle(m);
                contextMenu.add(0, 0, 0, 2132017799).setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)this);
            }
        }
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        final ClipboardManager clipboardManager = (ClipboardManager)this.a.j.getSystemService("clipboard");
        final CharSequence m = this.a.m();
        clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)"Preference", m));
        if (Build$VERSION.SDK_INT <= 32) {
            final Context j = this.a.j;
            Toast.makeText(j, (CharSequence)j.getString(2132019290, new Object[] { m }), 0).show();
        }
        return true;
    }
}
