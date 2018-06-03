package com.duy.android.compiler.builder.gradle;

import com.android.builder.core.DexOptions;
import com.android.builder.model.AaptOptions;
import com.duy.android.compiler.builder.internal.CompileOptions;

public interface AndroidConfig {
    /**
     * Specifies the API level to compile your project against. The Android plugin requires you to
     * configure this property.
     * <p>
     * <p>This means your code can use only the Android APIs included in that API level and lower.
     * You can configure the compile sdk version by adding the following to the <code>android</code>
     * block: <code>compileSdkVersion 26</code>.
     * <p>
     * <p>You should generally <a
     * href="https://developer.android.com/guide/topics/manifest/uses-sdk-element.html#ApiLevels">use
     * the most up-to-date API level</a> available. If you are planning to also support older API
     * levels, it's good practice to <a
     * href="https://developer.android.com/studio/write/lint.html">use the Lint tool</a> to check if
     * you are using APIs that are not available in earlier API levels.
     * <p>
     * <p>The value you assign to this property is parsed and stored in a normalized form, so
     * reading it back may return a slightly different value.
     */
    String getCompileSdkVersion();

    /**
     * Specifies options for the Android Asset Packaging Tool (AAPT).
     *
     * @see AaptOptions
     */
    AaptOptions getAaptOptions();

    /**
     * Specifies Java compiler options, such as the language level of the Java source code and
     * generated bytecode.
     *
     * @see CompileOptions
     */
    CompileOptions getCompileOptions();

    /**
     * Specifies options for the DEX tool, such as enabling library pre-dexing.
     * <p>
     * <p>Experimenting with DEX options tailored for your workstation may improve build
     * performance. To learn more, read <a
     * href="https://developer.android.com/studio/build/optimize-your-build.html#dex_options">Optimize
     * your build</a>.
     *
     * @see
     */
    DexOptions getDexOptions();
}