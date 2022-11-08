// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class DataChannel$Init
{
    public boolean a;
    public int b;
    public int c;
    public String d;
    public int e;
    
    public DataChannel$Init() {
        this.a = true;
        this.b = -1;
        this.c = -1;
        this.d = "";
        this.e = -1;
    }
    
    int getId() {
        return this.e;
    }
    
    int getMaxRetransmitTimeMs() {
        return this.b;
    }
    
    int getMaxRetransmits() {
        return this.c;
    }
    
    boolean getNegotiated() {
        return false;
    }
    
    boolean getOrdered() {
        return this.a;
    }
    
    String getProtocol() {
        return this.d;
    }
}
