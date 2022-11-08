// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

final class EntrypointRouter
{
    private EntrypointRouter() {
    }
    
    public static void readerProxyOnStreamData(final ReaderProxy readerProxy, final byte[] array) {
        readerProxy.onStreamData(array);
    }
    
    public static void readerProxyOnStreamError(final ReaderProxy readerProxy, final byte[] array) {
        readerProxy.onStreamError(phq.G((agsr)agzi.parseFrom((agzi)agsr.a, array, ExtensionRegistryLite.getGeneratedRegistry())).s());
    }
    
    public static void readerProxyOnStreamFinished(final ReaderProxy readerProxy) {
        readerProxy.onStreamFinished();
    }
    
    public static ListenableFuture routeCallAsync(final InstanceProxy instanceProxy, final int n, final byte[] array) {
        return instanceProxy.a(n, array);
    }
    
    public static void routeCallReadableStream(final InstanceProxy instanceProxy, final int n, final long n2, final byte[] array) {
        instanceProxy.b(n, n2, array);
    }
    
    public static void routeCallReadableWritableStream(final InstanceProxy instanceProxy, final int n, final long n2, final long n3) {
        instanceProxy.f(n);
    }
    
    public static byte[] routeCallSync(final InstanceProxy instanceProxy, final int n, final byte[] array) {
        return instanceProxy.e(n, array);
    }
    
    public static ListenableFuture routeCallWritableStream(final InstanceProxy instanceProxy, final int n, final long n2) {
        return instanceProxy.g(n);
    }
    
    public static void routeDispose(final InstanceProxy instanceProxy) {
        instanceProxy.c();
    }
    
    public static boolean routeMethodExists(final InstanceProxy instanceProxy, final int n) {
        return instanceProxy.d(n);
    }
    
    public static void writerProxyOnStreamClosed(final WriterProxy writerProxy) {
        writerProxy.a();
    }
    
    public static void writerProxyOnStreamError(final WriterProxy writerProxy, final byte[] array) {
        writerProxy.b(phq.G((agsr)agzi.parseFrom((agzi)agsr.a, array, ExtensionRegistryLite.getGeneratedRegistry())).s());
    }
}
