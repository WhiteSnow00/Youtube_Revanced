import java.io.FileNotFoundException;
import android.provider.ContactsContract$Contacts;
import java.io.InputStream;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.UriMatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class deo extends dek
{
    private static final UriMatcher a;
    
    static {
        final UriMatcher a2 = new UriMatcher(-1);
        (a = a2).addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        a2.addURI("com.android.contacts", "contacts/lookup/*", 1);
        a2.addURI("com.android.contacts", "contacts/#/photo", 2);
        a2.addURI("com.android.contacts", "contacts/#", 3);
        a2.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        a2.addURI("com.android.contacts", "phone_lookup/*", 5);
    }
    
    public deo(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    private static final InputStream e(final ContentResolver contentResolver, final Uri uri) {
        return ContactsContract$Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
    
    public final Class a() {
        return InputStream.class;
    }
    
    protected final /* bridge */ Object b(final Uri uri, final ContentResolver contentResolver) {
        final int match = deo.a.match(uri);
        InputStream inputStream = null;
        Label_0060: {
            if (match != 1) {
                if (match == 3) {
                    inputStream = e(contentResolver, uri);
                    break Label_0060;
                }
                if (match != 5) {
                    inputStream = contentResolver.openInputStream(uri);
                    break Label_0060;
                }
            }
            final Uri lookupContact = ContactsContract$Contacts.lookupContact(contentResolver, uri);
            if (lookupContact == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStream = e(contentResolver, lookupContact);
        }
        if (inputStream != null) {
            return inputStream;
        }
        throw new FileNotFoundException("InputStream is null for ".concat(String.valueOf(String.valueOf(uri))));
    }
    
    protected final void c(final Object o) {
        ((InputStream)o).close();
    }
}
