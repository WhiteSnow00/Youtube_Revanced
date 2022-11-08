// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.player;

import java.util.concurrent.Future;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

public class MultiPlayerResponseModelImpl extends PlayerResponseModelImpl
{
    public akve a;
    private final ListenableFuture j;
    
    public MultiPlayerResponseModelImpl(final PlayerResponseModel playerResponseModel, final ListenableFuture j) {
        super(playerResponseModel.z(), playerResponseModel.k(), playerResponseModel.n());
        this.j = j;
        this.a = null;
    }
    
    public final ListenableFuture a() {
        return this.j;
    }
    
    public final ahhb b() {
        final akve a = this.a;
        if (a != null && (a.c & 0x10) != 0x0) {
            ahhb ahhb;
            if ((ahhb = a.K) == null) {
                ahhb = ahhb.a;
            }
            return ahhb;
        }
        return null;
    }
    
    public final ahle c() {
        final akve a = this.a;
        if (a != null && (a.b & 0x2) != 0x0) {
            ancd ancd;
            if ((ancd = a.e) == null) {
                ancd = ancd.a;
            }
            ahle ahle;
            if ((ahle = ancd.i) == null) {
                ahle = ahle.a;
            }
            return ahle;
        }
        return null;
    }
    
    public final String d() {
        final akve a = this.a;
        if (a != null && (a.b & 0x80000) != 0x0) {
            return a.x;
        }
        return null;
    }
    
    public final String e() {
        final akve a = this.a;
        if (a != null && (a.b & 0x40000) != 0x0) {
            return a.w;
        }
        return null;
    }
    
    public final List f() {
        final akve a = this.a;
        if (a == null) {
            return null;
        }
        return a.m;
    }
    
    public final boolean g() {
        return this.j.isDone() && (boolean)tcp.h((Future)this.j, (Object)false);
    }
}
