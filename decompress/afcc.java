// 
// Decompiled by Procyon v0.6.0
// 

public enum afcc
{
    A("USER_HOME", 26, "user.home"), 
    B("USER_DIR", 27, "user.dir");
    
    private static final afcc[] C;
    
    a("JAVA_VERSION", 0, "java.version"), 
    b("JAVA_VENDOR", 1, "java.vendor"), 
    c("JAVA_VENDOR_URL", 2, "java.vendor.url"), 
    d("JAVA_HOME", 3, "java.home"), 
    e("JAVA_VM_SPECIFICATION_VERSION", 4, "java.vm.specification.version"), 
    f("JAVA_VM_SPECIFICATION_VENDOR", 5, "java.vm.specification.vendor"), 
    g("JAVA_VM_SPECIFICATION_NAME", 6, "java.vm.specification.name"), 
    h("JAVA_VM_VERSION", 7, "java.vm.version"), 
    i("JAVA_VM_VENDOR", 8, "java.vm.vendor"), 
    j("JAVA_VM_NAME", 9, "java.vm.name"), 
    k("JAVA_SPECIFICATION_VERSION", 10, "java.specification.version"), 
    l("JAVA_SPECIFICATION_VENDOR", 11, "java.specification.vendor"), 
    m("JAVA_SPECIFICATION_NAME", 12, "java.specification.name"), 
    n("JAVA_CLASS_VERSION", 13, "java.class.version"), 
    o("JAVA_CLASS_PATH", 14, "java.class.path"), 
    p("JAVA_LIBRARY_PATH", 15, "java.library.path"), 
    q("JAVA_IO_TMPDIR", 16, "java.io.tmpdir"), 
    r("JAVA_COMPILER", 17, "java.compiler"), 
    @Deprecated
    s("JAVA_EXT_DIRS", 18, "java.ext.dirs"), 
    t("OS_NAME", 19, "os.name"), 
    u("OS_ARCH", 20, "os.arch"), 
    v("OS_VERSION", 21, "os.version"), 
    w("FILE_SEPARATOR", 22, "file.separator"), 
    x("PATH_SEPARATOR", 23, "path.separator"), 
    y("LINE_SEPARATOR", 24, "line.separator"), 
    z("USER_NAME", 25, "user.name");
    
    private final String D;
    
    private afcc(final String s, final int n, final String d) {
        this.D = d;
    }
    
    public final String a() {
        return System.getProperty(this.D);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.D);
        sb.append("=");
        sb.append(this.a());
        return sb.toString();
    }
}
