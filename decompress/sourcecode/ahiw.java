import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahiw extends agzi implements ahax
{
    public static final ahiw a;
    private static volatile ahbe h;
    public int b;
    public apie c;
    public ajrz d;
    public aoml e;
    public apif f;
    public apid g;
    private aldt i;
    private ahlt j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)ahiw.class, (agzi)(a = new ahiw()));
    }
    
    private ahiw() {
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahiw.h) == null) {
                    synchronized (ahiw.class) {
                        if (ahiw.h == null) {
                            ahiw.h = (ahbe)new agzb((agzi)ahiw.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahiw.a;
            }
            case 4: {
                return new agza((agzi)ahiw.a);
            }
            case 3: {
                return new ahiw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahiw.a, "\u0001\u0007\u0000\u0001\ufd61\u1d59\ufcb1\ua32a\u0007\u0000\u0000\u0006\ufd61\u1d59\u1409\u0000\uf95d\u2871\u1009\u0001\uf09c\u28a0\u1409\u0002\ue162\u2a82\u1409\u0004\ue879\u32f6\u1409\u0003\ue4bf\ua2da\u1409\u0005\ufcb1\ua32a\u1409\u0006", new Object[] { "b", "c", "d", "e", "j", "i", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
