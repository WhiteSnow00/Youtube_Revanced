import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajga extends agzi implements ahax
{
    public static final ajga a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public aqcz d;
    public String e;
    public ailc f;
    public ajfz g;
    private byte i;
    
    static {
        final ajga a2 = new ajga();
        agzi.registerDefaultInstance(ajga.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 314573701, ahcm.k, ajga.class);
    }
    
    private ajga() {
        this.i = 2;
        this.e = "";
    }
    
    @Override
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
                if ((h = ajga.h) == null) {
                    synchronized (ajga.class) {
                        if (ajga.h == null) {
                            ajga.h = (ahbe)new agzb((agzi)ajga.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajga.a;
            }
            case 4: {
                return new agza((agzi)ajga.a);
            }
            case 3: {
                return new ajga();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajga.a, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0001\u0002\u1008\u0002\u0006\u1009\u0006\u0007\u1409\u0001\b\u1009\u0007", new Object[] { "c", "e", "f", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
