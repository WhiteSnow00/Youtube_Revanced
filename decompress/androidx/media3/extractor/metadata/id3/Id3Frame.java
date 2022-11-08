// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata$Entry;

public abstract class Id3Frame implements Metadata$Entry
{
    public final String f;
    
    public Id3Frame(final String f) {
        this.f = f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        return this.f;
    }
}
