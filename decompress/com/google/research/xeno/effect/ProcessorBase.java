// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect;

import com.google.mediapipe.framework.MediaPipeException;
import java.util.concurrent.CopyOnWriteArraySet;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class ProcessorBase implements agrs
{
    public final aqro c;
    public final ReentrantReadWriteLock d;
    public long e;
    protected final Graph f;
    public final AndroidPacketCreator g;
    public final CopyOnWriteArraySet h;
    public final CopyOnWriteArraySet i;
    public final CopyOnWriteArraySet j;
    public volatile Effect k;
    
    protected ProcessorBase(final aqro c) {
        this.d = new ReentrantReadWriteLock();
        this.h = new CopyOnWriteArraySet();
        this.i = new CopyOnWriteArraySet();
        this.j = new CopyOnWriteArraySet();
        this.c = c;
        final Graph f = new Graph();
        this.f = f;
        final long a = c.a;
        while (true) {
            if (a == 0L) {
                break Label_0082;
            }
            try {
                f.g(a);
                this.g = new AndroidPacketCreator(this.f);
            }
            catch (final MediaPipeException ex) {
                continue;
            }
            break;
        }
    }
    
    protected static native void nativeImageProcessorTick(final long p0, final long p1);
    
    protected static native long nativeNewImageProcessor(final long p0, final long p1, final long p2, final long p3, final long p4, final long p5, final ProcessorBase$PacketCallback p6, final ProcessorBase$PacketCallback p7);
    
    protected static native long nativeNewVideoProcessor(final long p0, final long p1, final long p2, final ProcessorBase$PacketCallback p3, final ProcessorBase$PacketCallback p4, final ProcessorBase$AuxOutputCallback p5);
    
    private static native void nativePrepareCurrentEffectToStartRecording(final long p0);
    
    private static native void nativeRelease(final long p0);
    
    public static native void nativeSendVideoProcessorAudioPacket(final long p0, final long p1, final long p2, final ProcessorBase$Callback p3);
    
    public static native void nativeSendVideoProcessorFramePacket(final long p0, final long p1, final long p2, final ProcessorBase$Callback p3);
    
    public static native void nativeSetEffect(final long p0, final long p1, final ProcessorBase$Callback p2);
    
    public static native void nativeStartVideoProcessing(final long p0, final int p1, final long p2, final long p3, final int p4, final int p5, final ProcessorBase$Callback p6);
    
    public static native void nativeStopVideoProcessing(final long p0, final ProcessorBase$Callback p1);
    
    public final void c(final agrr agrr) {
        this.h.clear();
        this.h.add(agrr);
    }
    
    public final void h(final agrr agrr) {
        this.h.add(agrr);
    }
    
    public final void i(final aqss aqss) {
        this.d.readLock().lock();
        try {
            aqss.a(this.e);
        }
        finally {
            this.d.readLock().unlock();
        }
    }
    
    public final void j() {
        this.d.writeLock().lock();
        try {
            final long e = this.e;
            if (e != 0L) {
                nativeRelease(e);
                this.f.i();
            }
            this.e = 0L;
        }
        finally {
            this.d.writeLock().unlock();
        }
    }
    
    public final void l(final Effect effect, final ProcessorBase$Callback processorBase$Callback) {
        this.i((aqss)new aqsj(this, processorBase$Callback, effect, 2));
    }
}
