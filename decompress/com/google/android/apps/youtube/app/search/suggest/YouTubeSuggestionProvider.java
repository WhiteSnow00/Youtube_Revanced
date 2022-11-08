// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.search.suggest;

import java.util.Iterator;
import java.util.Collection;
import java.io.IOException;
import java.util.Locale;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentProvider;

public class YouTubeSuggestionProvider extends ContentProvider
{
    private final acww a() {
        return ((jle)ahbz.az(this.getContext(), (Class)jle.class)).zQ().p();
    }
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        return 0;
    }
    
    public final String getType(final Uri uri) {
        return "vnd.android.cursor.dir/vnd.android.search.suggest";
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        final acww a = this.a();
        if (a.a.f && !a.c.c().g()) {
            ((SQLiteOpenHelper)a.m.b).getWritableDatabase().insert("suggestions", "query", contentValues);
        }
        return null;
    }
    
    public final boolean onCreate() {
        return true;
    }
    
    public final Cursor query(final Uri uri, String[] array, final String s, final String[] array2, final String s2) {
        String lowerCase;
        if (uri.getPathSegments() != null && uri.getLastPathSegment() != null && uri.getPathSegments().size() > 1) {
            lowerCase = uri.getLastPathSegment().toLowerCase(Locale.getDefault());
        }
        else {
            lowerCase = "";
        }
        array = (String[])(Object)new acwt();
        try {
            final Collection h = this.a().h(lowerCase);
            ((acwt)(Object)array).a.clear();
            final Iterator iterator = h.iterator();
            while (iterator.hasNext()) {
                ((acwt)(Object)array).a.add(iterator.next());
            }
        }
        catch (final IOException ex) {
            trn.n("error fetching suggestions", (Throwable)ex);
        }
        return (Cursor)(Object)array;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException();
    }
}
