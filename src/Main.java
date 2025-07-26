/*
* Idea:
* - Make a text file with all periodic elements, with atomic masses
* e.g.,
* C 12.001,
* O 15.999
*
* - add rounding to certain sig figs
*
* - Ask for input (e.g. CH3COOH)
* - Ask for sig figs [or just default to AP default]
* - Save in string
* - Recursively do the following:
*   - Move letters to temp until a capital letter/number comes by
*   - Match temp with element
*   - Read next number if available
*   - Add to totalMass variable
*   - Repeat until string is empty
*
* - Return the following:
*   - "1 mol originalMolecule = totalMass g (# sigFigs)"
*
* Repeat until "end" is inputted.
* */