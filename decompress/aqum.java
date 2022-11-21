import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqum extends ahcz implements aheo
{
    private static final aqum a;
    private static volatile ahev b;
    private int c;
    private Object d;
    
    static {
        ahcz.registerDefaultInstance(aqum.class, a = new aqum());
    }
    
    private aqum() {
        this.c = 0;
    }
    
    public static ahev a() {
        return aqum.a.getParserForType();
    }
    
    public static aqum c() {
        return aqum.a;
    }
    
    public aqul b() {
        if (this.c == 1) {
            return (aqul)this.d;
        }
        return aqul.c();
    }
    
    public aqup d() {
        if (this.c == 3) {
            return (aqup)this.d;
        }
        return aqup.b();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqum.b) == null) {
                    synchronized (aqum.class) {
                        if (aqum.b == null) {
                            aqum.b = (ahev)new ahcs((ahcz)aqum.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqum.a;
            }
            case 4: {
                return new ahcr((ahcz)c());
            }
            case 3: {
                return new aqum();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqum.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "d", "c", aqul.class, aqut.class, aqup.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public aqut e() {
        if (this.c == 2) {
            return (aqut)this.d;
        }
        return aqut.b();
    }
    
    public boolean f() {
        return this.c == 1;
    }
    
    public boolean g() {
        return this.c == 3;
    }
    
    public boolean h() {
        return this.c == 2;
    }
}
