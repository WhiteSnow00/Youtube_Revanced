import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnr extends agzi implements ahax
{
    public static final ahnr a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ahnr.class, a = new ahnr());
    }
    
    private ahnr() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahnr.d) == null) {
                    synchronized (ahnr.class) {
                        if (ahnr.d == null) {
                            ahnr.d = (ahbe)new agzb((agzi)ahnr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahnr.a;
            }
            case 4: {
                return new agza((agzi)ahnr.a);
            }
            case 3: {
                return new ahnr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnr.a, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u103c\u0000\f\u103c\u0000\r\u103c\u0000\u000e\u103c\u0000", new Object[] { "c", "b", ahnt.class, ahny.class, ahnu.class, ahnw.class, ahnv.class, ahop.class, ahok.class, ahob.class, ahns.class, ahnz.class, ahnq.class, ahnx.class, ahnl.class, ahnn.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
