import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyt extends agzi implements ahax
{
    public static final agzr a;
    public static final apyt b;
    private static volatile ahbe e;
    public agzy c;
    public agzq d;
    private byte f;
    
    static {
        a = (agzr)new altr(14);
        agzi.registerDefaultInstance(apyt.class, b = new apyt());
    }
    
    private apyt() {
        this.f = 2;
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyIntList();
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
                final ahbe e;
                if ((e = apyt.e) == null) {
                    synchronized (apyt.class) {
                        if (apyt.e == null) {
                            apyt.e = (ahbe)new agzb((agzi)apyt.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apyt.b;
            }
            case 4: {
                return new agza((agzi)apyt.b);
            }
            case 3: {
                return new apyt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyt.b, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u041b\u0002,", new Object[] { "c", apyn.class, "d", apyq.a() });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
