import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuc extends ahcz implements aheo
{
    public static final apuc a;
    private static volatile ahev p;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public ajws g;
    public aisc h;
    public anxb i;
    public ahdp j;
    public apth k;
    public apth l;
    public anxb m;
    public int n;
    public ahbt o;
    private ahjl q;
    private byte r;
    
    static {
        ahcz.registerDefaultInstance(apuc.class, a = new apuc());
    }
    
    private apuc() {
        this.c = 0;
        this.e = 0;
        this.r = 2;
        this.j = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.o = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev p3;
                if ((p3 = apuc.p) == null) {
                    synchronized (apuc.class) {
                        if (apuc.p == null) {
                            apuc.p = (ahev)new ahcs((ahcz)apuc.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return apuc.a;
            }
            case 4: {
                return new ahcr((ahcz)apuc.a);
            }
            case 3: {
                return new apuc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuc.a, "\u0001\u000f\u0002\u0001\u0001\u000f\u000f\u0000\u0001\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u143c\u0000\u0004\u041b\u0005\u143c\u0001\u0006\u1009\b\u0007\u1409\f\b\u100a\r\t\u143c\u0001\n\u143c\u0001\u000b\u1409\n\f\u1409\u0002\r\u1009\t\u000e\u143c\u0001\u000f\u100c\u000b", new Object[] { "d", "c", "f", "e", "b", "g", "h", ajws.class, "j", apto.class, aowb.class, "k", "q", "o", ajws.class, aiet.class, "m", "i", "l", anxb.class, "n", aprh.s });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
