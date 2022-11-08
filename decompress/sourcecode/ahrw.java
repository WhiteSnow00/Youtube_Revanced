import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrw extends agzi implements ahax
{
    public static final ahrw a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public aorm d;
    public int e;
    private byte g;
    
    static {
        final ahrw a2 = new ahrw();
        agzi.registerDefaultInstance(ahrw.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)anss.a, a2, (MessageLite)a2, null, 404376390, ahcm.k, ahrw.class);
    }
    
    private ahrw() {
        this.g = 2;
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
                final ahbe f;
                if ((f = ahrw.f) == null) {
                    synchronized (ahrw.class) {
                        if (ahrw.f == null) {
                            ahrw.f = (ahbe)new agzb((agzi)ahrw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahrw.a;
            }
            case 4: {
                return new agza((agzi)ahrw.a);
            }
            case 3: {
                return new ahrw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001", new Object[] { "c", "d", "e", ampo.a() });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
