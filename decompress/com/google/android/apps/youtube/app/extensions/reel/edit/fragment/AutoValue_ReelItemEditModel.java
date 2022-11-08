// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;

public final class AutoValue_ReelItemEditModel extends ReelItemEditModel
{
    public final RecordingInfo a;
    public final VideoMetaData b;
    public final EditableVideoEdits c;
    public final String d;
    public final boolean e;
    
    public AutoValue_ReelItemEditModel(final RecordingInfo a, final VideoMetaData b, final EditableVideoEdits c, final String d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final hiq a() {
        return new hiq((ReelItemEditModel)this);
    }
    
    @Override
    public final EditableVideoEdits b() {
        return this.c;
    }
    
    @Override
    public final VideoMetaData c() {
        return this.b;
    }
    
    @Override
    public final RecordingInfo d() {
        return this.a;
    }
    
    @Override
    public final String e() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ReelItemEditModel) {
            final ReelItemEditModel reelItemEditModel = (ReelItemEditModel)o;
            if (this.a.equals(reelItemEditModel.d()) && this.b.equals((Object)reelItemEditModel.c()) && this.c.equals(reelItemEditModel.b()) && this.d.equals(reelItemEditModel.e()) && this.e == reelItemEditModel.f()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean f() {
        return this.e;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        int n;
        if (!this.e) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String string3 = this.c.toString();
        final String d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder("ReelItemEditModel{recordingInfo=");
        sb.append(string);
        sb.append(", videoMetaData=");
        sb.append(string2);
        sb.append(", editableVideoEdits=");
        sb.append(string3);
        sb.append(", stateEventFilePath=");
        sb.append(d);
        sb.append(", isWatchLaterStickerAdded=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
