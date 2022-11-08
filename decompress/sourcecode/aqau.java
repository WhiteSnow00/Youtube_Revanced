import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqau extends agzi implements ahax
{
    public static final aqau a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public ahca e;
    
    static {
        agzi.registerDefaultInstance(aqau.class, a = new aqau());
    }
    
    private aqau() {
        this.c = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aqau.f) == null) {
                    synchronized (aqau.class) {
                        if (aqau.f == null) {
                            aqau.f = (ahbe)new agzb((agzi)aqau.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqau.a;
            }
            case 4: {
                return new agza((agzi)aqau.a);
            }
            case 3: {
                return new aqau();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqau.a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u103c\u0000\f\u103c\u0000\r\u103c\u0000\u000e\u1009\u0000", new Object[] { "d", "c", "b", aoaa.class, anzw.class, anzp.class, anzv.class, anzq.class, anzo.class, anzn.class, anzt.class, anzs.class, anzr.class, anzz.class, amdt.class, amds.class, "e" });
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
