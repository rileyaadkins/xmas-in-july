export { createHeader };

const createHeader = () => {
  const header = document.createElement("header");
  header.innerHTML = `
        <h1>
          Ali's Page <br />
          <div class="header-image"></div>
        </h1>

        <nav>
          <ul class="nav-list">
            <li>
              <a href="home.html">Home</a>
            </li>
            <li>
              <a href="./artists.html">Artists</a>
            </li>
          </ul>
        </nav>
  `;
  return header;
};
