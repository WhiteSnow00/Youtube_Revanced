// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata$Entry;

public abstract class SpliceCommand implements Metadata$Entry
{
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return "SCTE-35 splice command: type=".concat(String.valueOf(this.getClass().getSimpleName()));
    }
}
