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
    private final adal a() {
        return ((jmr)aegu.N(this.getContext(), jmr.class)).AC().p();
    }
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        return 0;
    }
    
    public final String getType(final Uri uri) {
        return "vnd.android.cursor.dir/vnd.android.search.suggest";
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        final adal a = this.a();
        if (a.a.f && !a.c.c().g()) {
            ((SQLiteOpenHelper)a.m.a).getWritableDatabase().insert("suggestions", "query", contentValues);
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
        array = (String[])(Object)new adai();
        try {
            final Collection h = this.a().h(lowerCase);
            ((adai)(Object)array).a.clear();
            final Iterator iterator = h.iterator();
            while (iterator.hasNext()) {
                ((adai)(Object)array).a.add(iterator.next());
            }
        }
        catch (final IOException ex) {
            tut.n("error fetching suggestions", (Throwable)ex);
        }
        return (Cursor)(Object)array;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException();
    }
}
